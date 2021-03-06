/* 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jetspeed.security.spi.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.jetspeed.security.JetspeedPrincipalQueryContext;

/**
 * MySql specific implementation of the principal lookup manager.
 * 
 * 
 * @author <a href="mailto:joachim@wemove.com">Joachim Mueller</a>
 * 
 */
public class JetspeedPrincipalLookupManagerMySql extends JetspeedPrincipalLookupManagerAbstract {

	/**
	 * Add limit operator if we are on MySql. This is much faster than
	 * paging via JDBC and also is a work around because the MySQL driver
	 * retrieves the complete result set. This would result in a very high
	 * memory consumption with large result sets.
	 * 
	 * See http://dev.mysql.com/doc/refman/5.0/en/connector-j-reference-
	 * implementation-notes.html -> Resultset
	 * 
	 * @see org.apache.jetspeed.security.spi.impl.JetspeedPrincipalLookupManagerAbstract#getPagingSql(java.lang.String, org.apache.jetspeed.security.JetspeedPrincipalQueryContext)
	 */
	@Override
	protected String getPagingSql(String sql, JetspeedPrincipalQueryContext queryContext) {
		return sql + " LIMIT " + queryContext.getOffset() + "," + queryContext.getLength();
	}

	/**
	 * No scrolling has to be done because first result is already at the
	 * offset (uses the LIMIT sql operator).
	 * 
	 * @see org.apache.jetspeed.security.spi.impl.JetspeedPrincipalLookupManagerAbstract#scrollToOffset(java.sql.Connection, java.sql.ResultSet, long)
	 */
	@Override
	protected void scrollToOffset(Connection con, ResultSet rs, long offset) throws SQLException {
		// no scrolling has to be done because first result is already at the
		// offset (uses the LIMIT sql operator)
		return;
	}

}
