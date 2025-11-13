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
package riskregister.process;

import java.util.Map;
//Task input for user task 'HOD Verify RR' in process 'RiskRegisterProcess'
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "HODVerifyRR", processName = "RiskRegisterProcess")
public class RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskInput {

    public static RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskInput fromMap(Map<String, Object> params) {
        RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskInput item = new RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskInput();
        item.riskRegister = (riskregister.model.RiskRegister) params.get("riskRegister");
        item.approvalLog = (riskregister.model.ApprovalLog) params.get("approvalLog");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private riskregister.model.RiskRegister riskRegister;

    public riskregister.model.RiskRegister getRiskRegister() {
        return riskRegister;
    }

    public void setRiskRegister(riskregister.model.RiskRegister riskRegister) {
        this.riskRegister = riskRegister;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private riskregister.model.ApprovalLog approvalLog;

    public riskregister.model.ApprovalLog getApprovalLog() {
        return approvalLog;
    }

    public void setApprovalLog(riskregister.model.ApprovalLog approvalLog) {
        this.approvalLog = approvalLog;
    }
}
