/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jetspeed.scheduler;

import java.util.List;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

/**
 * Queue for the scheduler.
 *
 * @author <a href="mailto:mbryson@mont.mindspring.com">Dave Bryson</a>
 * @version $Id: JobQueue.java 516448 2007-03-09 16:25:47Z ate $
 */
public class JobQueue
{
    /**
     * The queue of <code>JobEntry</code> objects.
     */
    private Vector queue = null;

    /**
     * Creates a new instance.
     *
     * @exception Exception A generic exception.
     */
    public JobQueue()
        throws Exception
    {
        queue = new Vector(10);
    }

    /**
     * Return the next job off the top of the queue, or <code>null</code> if
     * there are no jobs in the queue.
     *
     * @return The next job in the queue.
     */
    public JobEntry getNext()
    {
        if ( queue.size() > 0 )
        {
            return (JobEntry)queue.elementAt(0);
        }
        else
        {
            return null;
        }
    }

    /**
     * Return a specific job.
     *
     * @param je The JobEntry we are looking for.
     * @return A JobEntry.
     */
    public JobEntry getJob(JobEntry je)
    {
        int index = -1;

        if ( je != null )
        {
            index = queue.indexOf(je);
        }

        if ( index < 0 )
        {
            return null;
        }
        else
        {
            return (JobEntry)queue.elementAt(index);
        }
    }

    /**
     * List jobs in the queue.  This is used by the scheduler UI.
     *
     * @return A Vector of <code>JobEntry</code> objects.
     */
    public Vector list()
    {
        if ( queue != null && queue.size() > 0 )
        {
            return (Vector)queue.clone();
        }
        else
        {
            return null;
        }
    }

    /**
     * Add a job to the queue.
     *
     * @param je A JobEntry job.
     */
    public synchronized void add(JobEntry je)
    {
        queue.addElement(je);
        sortQueue();
    }

    /**
     * Batch load jobs.  Retains any already enqueued jobs.  Called on
     * <code>SchedulerService</code> start-up.
     *
     * @param jobEntries A list of the <code>JobEntry</code> objects to load.
     */
    public synchronized void batchLoad(List jobEntries)
    {
        if (jobEntries != null)
        {
            queue.addAll(jobEntries);
            sortQueue();
        }

    }

    /**
     * Remove a job from the queue.
     *
     * @param je A JobEntry with the job to remove.
     */
    public synchronized void remove(JobEntry je)
    {
        queue.removeElement(je);
        sortQueue();
    }

    /**
     * Modify a job on the queue.
     *
     * @param je A JobEntry with the job to modify
     */
    public synchronized void modify(JobEntry je)
    {
        sortQueue();
    }

    /**
     * Update the job for its next run time.
     *
     * @param je A JobEntry to be updated.
     * @exception Exception, a generic exception.
     */
    public synchronized void updateQueue(JobEntry je)
        throws Exception
    {
        je.calcRunTime();
        sortQueue();
    }

    /**
     * Re-sort the existing queue.  Consumers of this method should be
     * <code>synchronized</code>.
     */
    private void sortQueue()
    {
        Comparator aComparator = new Comparator () 
            {
                public int compare(Object o1, Object o2) 
                {
                    Long time1 = new Long (((JobEntry)o1).getNextRuntime());
                    Long time2 = new Long (((JobEntry)o2).getNextRuntime());
                    return (time1.compareTo(time2));
                }
            };
                                               
        Collections.sort(queue,aComparator);
    }
}
