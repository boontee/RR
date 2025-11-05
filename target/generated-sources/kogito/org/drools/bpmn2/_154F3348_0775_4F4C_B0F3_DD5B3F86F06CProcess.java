package org.drools.bpmn2;

import org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("_154F3348-0775-4F4C-B0F3-DD5B3F86F06C")
@io.quarkus.runtime.Startup()
public class _154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcess extends org.kie.kogito.process.impl.AbstractProcess<org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel> {

    @jakarta.inject.Inject()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        super(app, java.util.Arrays.asList(), correlations, factory);
        activate();
    }

    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcess() {
    }

    @Override()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance createInstance(org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel value) {
        return new org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance createInstance(java.lang.String businessKey, org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel value) {
        return new org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel value) {
        return new org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel createModel() {
        return new org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel();
    }

    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel) value);
    }

    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel) value);
    }

    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06CProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("_154F3348-0775-4F4C-B0F3-DD5B3F86F06C", true);
        factory.name("_154F3348-0775-4F4C-B0F3-DD5B3F86F06C");
        factory.packageName("org.drools.bpmn2");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("jbpm.enable.multi.con", null);
        factory.metaData("jbpm.transactions.enable", "true");
        factory.metaData("TargetNamespace", "");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B11A0D64-CFF4-4698-A0E7-B49B918B525C"));
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.name("End");
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.terminate(false);
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.metaData("UniqueId", "_B11A0D64-CFF4-4698-A0E7-B49B918B525C");
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.metaData("Lane", "RMD");
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"));
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.name("Need Correction?");
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.type(2);
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.metaData("UniqueId", "_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3");
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.metaData("elementname", "Need Correction?");
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.metaData("Default", "_4FA8CE12-E261-4A07-A2F3-F01C39CA2C7A");
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), "_965D5D98-4199-4BFA-A4B9-9C4B5DC8B6A2", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return true;"), 0, false);
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.done();
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), "_965D5D98-4199-4BFA-A4B9-9C4B5DC8B6A2", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return true;"), 0, false);
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"));
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.name("Need Correction?");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.type(2);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.metaData("UniqueId", "_F8071055-52F6-4F5D-BE9E-00C51CC97456");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.metaData("elementname", "Need Correction?");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.metaData("Default", "_2A630041-EB7E-4471-83AC-2E51204405EE");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), "_BFB8D2DF-5878-49D3-B39D-FCCEE7647AFF", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return true;"), 0, false);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.done();
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), "_BFB8D2DF-5878-49D3-B39D-FCCEE7647AFF", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return true;"), 0, false);
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"));
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.name("Need Correction?");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.type(2);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.metaData("UniqueId", "_B1CA7113-6053-4EB8-A714-F214C0D1E051");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.metaData("elementname", "Need Correction?");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.metaData("Default", "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), "_3D88550D-81D4-4256-90D2-49E5EBAC4C54", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return true;"), 0, false);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.done();
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), "_3D88550D-81D4-4256-90D2-49E5EBAC4C54", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return true;"), 0, false);
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928 = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"));
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.name("Join");
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.type(2);
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.metaData("UniqueId", "_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928");
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.metaData("Lane", "Maker");
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"));
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.name("Mark Process for Review");
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.metaData("UniqueId", "_18F8C933-387A-41A7-A7C0-BFB670B66BF1");
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.metaData("NodeType", "ScriptTask");
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.metaData("Lane", "Divisional Head");
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.action(kcontext -> {
        });
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"));
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.name("Mark Process for Review");
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.metaData("UniqueId", "_A73C6F1E-9D94-4734-8B96-6C413A67B347");
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.metaData("NodeType", "ScriptTask");
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.action(kcontext -> {
        });
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"));
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.name("Mark Process for Review");
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.metaData("UniqueId", "_F222CB4E-A07A-409D-9F65-AC1790C5293F");
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.metaData("NodeType", "ScriptTask");
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.action(kcontext -> {
        });
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_F37DF12F_2C90_4492_BB4F_102047D35890 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F37DF12F-2C90-4492-BB4F-102047D35890"));
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.name("Start");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.interrupting(false);
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.metaData("UniqueId", "_F37DF12F-2C90-4492-BB4F-102047D35890");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.metaData("EventType", "none");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.name("SRO Submit RR");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("NodeName", "SRO Submit RR");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("UNIQUE_TASK_ID", "_1C18E257-48C8-4832-91D9-C1FCC57190C5");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.done();
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.metaData("UniqueId", "_1C18E257-48C8-4832-91D9-C1FCC57190C5");
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.name("HOD Approve");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("NodeName", "HOD Approve");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("UNIQUE_TASK_ID", "_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.done();
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.metaData("UniqueId", "_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6");
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7"));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.name("RMD Verify RR");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("NodeName", "RMD Verify RR");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("UNIQUE_TASK_ID", "_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.done();
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.metaData("UniqueId", "_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7");
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DB6511C3-530F-4D9B-B789-1D8DC62AEE70"));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.name("Maker Submit RR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("NodeName", "Maker Submit RR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("UNIQUE_TASK_ID", "_DB6511C3-530F-4D9B-B789-1D8DC62AEE70");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.done();
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.metaData("UniqueId", "_DB6511C3-530F-4D9B-B789-1D8DC62AEE70");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.metaData("elementname", "Maker Submit Risk Register");
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DE0A504F-8E6A-4BD7-8000-5DFFF2191422"));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.name("Div Head Verify RR");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("NodeName", "Div Head Verify RR");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("UNIQUE_TASK_ID", "_DE0A504F-8E6A-4BD7-8000-5DFFF2191422");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.done();
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.metaData("UniqueId", "_DE0A504F-8E6A-4BD7-8000-5DFFF2191422");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.metaData("elementname", "Verify Risk Register");
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.name("JRO Verify RR");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("NodeName", "JRO Verify RR");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("UNIQUE_TASK_ID", "_E82B11A3-F055-4091-AB9E-6869B67ACE6E");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.done();
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.metaData("UniqueId", "_E82B11A3-F055-4091-AB9E-6869B67ACE6E");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.metaData("elementname", "Verify Risk Register");
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_D4D21E2A-9D22-4A2E-80DB-7E70D1232116"));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.name("HOD Verify RR");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("NodeName", "HOD Verify RR");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("UNIQUE_TASK_ID", "_D4D21E2A-9D22-4A2E-80DB-7E70D1232116");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.done();
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.metaData("UniqueId", "_D4D21E2A-9D22-4A2E-80DB-7E70D1232116");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.metaData("elementname", "HOD Verify RR");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B11A0D64-CFF4-4698-A0E7-B49B918B525C"), "_60261F81-B054-48FB-8C6B-D0D115CF0B2C");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DE0A504F-8E6A-4BD7-8000-5DFFF2191422"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"), "_3B74DA92-2E33-4655-92BD-E0529A7FFD9D");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"), "_F7343F91-D981-49CD-ACB2-ED1DC23CEB2A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_D4D21E2A-9D22-4A2E-80DB-7E70D1232116"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"), "_D3B6752D-76A8-417B-9A4E-45A70ABF5D6B");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F37DF12F-2C90-4492-BB4F-102047D35890"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_A630CD3C-BE1E-42F4-BE60-05170A4E9005");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_D7F5C003-3751-4C43-AE44-8175C80BE005");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_23E36111-18BE-4010-86A0-3F056BA17EF2");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_FF2F5065-D898-4E0F-A27E-36083B32BC85");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), "_965D5D98-4199-4BFA-A4B9-9C4B5DC8B6A2");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), "_BFB8D2DF-5878-49D3-B39D-FCCEE7647AFF");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), "_3D88550D-81D4-4256-90D2-49E5EBAC4C54");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), "_2A630041-EB7E-4471-83AC-2E51204405EE");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7"), "_D2F8F99E-BA9B-4D5A-829C-D10733E51485");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DB6511C3-530F-4D9B-B789-1D8DC62AEE70"), "_8BFB995A-EA2A-4665-AECC-E944E98D16A9");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DB6511C3-530F-4D9B-B789-1D8DC62AEE70"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DE0A504F-8E6A-4BD7-8000-5DFFF2191422"), "_161D5699-3DF0-44F9-8E2D-C22C997D694D");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), "_4FA8CE12-E261-4A07-A2F3-F01C39CA2C7A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_D4D21E2A-9D22-4A2E-80DB-7E70D1232116"), "_D129D052-ED50-4D11-9F52-FA98CD18CC6B");
        factory.validate();
        return factory.getProcess();
    }
}
