package org.drools.bpmn2;

import org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel;

public class _154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<_154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel> {

    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcess process, _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcess process, _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcess process, _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcess process, _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcess process, _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(_154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(_154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
