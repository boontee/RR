/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.drools.bpmn2;

import org.kie.kogito.usertask.model.Attachment;
import org.kie.kogito.usertask.model.AttachmentInfo;
import org.kie.kogito.usertask.model.Comment;
import org.kie.kogito.process.workitem.TaskModel;

public class _154F3348_0775_4F4C_B0F3_DD5B3F86F06C_TaskModelFactory {

    public static TaskModel from(org.kie.kogito.process.WorkItem workItem) {
        switch(workItem.getNodeId().toExternalFormat()) {
            case "_D4D21E2A-9D22-4A2E-80DB-7E70D1232116":
                return _154F3348_0775_4F4C_B0F3_DD5B3F86F06C__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskModel.from(workItem);
            case "_E82B11A3-F055-4091-AB9E-6869B67ACE6E":
                return _154F3348_0775_4F4C_B0F3_DD5B3F86F06C__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskModel.from(workItem);
            case "_DE0A504F-8E6A-4BD7-8000-5DFFF2191422":
                return _154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskModel.from(workItem);
            case "_DB6511C3-530F-4D9B-B789-1D8DC62AEE70":
                return _154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskModel.from(workItem);
            case "_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7":
                return _154F3348_0775_4F4C_B0F3_DD5B3F86F06C__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskModel.from(workItem);
            case "_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6":
                return _154F3348_0775_4F4C_B0F3_DD5B3F86F06C__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskModel.from(workItem);
            case "_1C18E257-48C8-4832-91D9-C1FCC57190C5":
                return _154F3348_0775_4F4C_B0F3_DD5B3F86F06C__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskModel.from(workItem);
            default:
                throw new IllegalArgumentException("Invalid task name for work item " + workItem);
        }
    }
}
