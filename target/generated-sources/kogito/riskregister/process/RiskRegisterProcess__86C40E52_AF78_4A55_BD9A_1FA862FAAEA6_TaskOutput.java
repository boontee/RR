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

import java.util.HashMap;
import java.util.Map;
import org.kie.kogito.MapOutput;
//Task output for user task 'HOD Approve' in process 'RiskRegisterProcess'
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "HODApprove", processName = "RiskRegisterProcess")
public class RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput implements MapOutput {

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> params = new HashMap<>();
        params.put("riskRegister", this.riskRegister);
        params.put("approval", this.approval);
        return params;
    }

    public static RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput fromMap(Map<String, Object> params) {
        riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput result = new RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput();
        result.riskRegister = (riskregister.model.RiskRegister) params.get("riskRegister");
        result.approval = (riskregister.model.Approval) params.get("approval");
        return result;
    }

    @UserTaskParam(value = ParamType.OUTPUT)
    private riskregister.model.RiskRegister riskRegister;

    public riskregister.model.RiskRegister getRiskRegister() {
        return riskRegister;
    }

    public void setRiskRegister(riskregister.model.RiskRegister riskRegister) {
        this.riskRegister = riskRegister;
    }

    @UserTaskParam(value = ParamType.OUTPUT)
    private riskregister.model.Approval approval;

    public riskregister.model.Approval getApproval() {
        return approval;
    }

    public void setApproval(riskregister.model.Approval approval) {
        this.approval = approval;
    }
}
