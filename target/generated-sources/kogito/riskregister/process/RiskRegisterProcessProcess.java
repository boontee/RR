package riskregister.process;

import riskregister.process.RiskRegisterProcessModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("RiskRegisterProcess")
@io.quarkus.runtime.Startup()
public class RiskRegisterProcessProcess extends org.kie.kogito.process.impl.AbstractProcess<riskregister.process.RiskRegisterProcessModel> {

    @jakarta.inject.Inject()
    public RiskRegisterProcessProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        super(app, java.util.Arrays.asList(), correlations, factory);
        activate();
    }

    public RiskRegisterProcessProcess() {
    }

    @Override()
    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(riskregister.process.RiskRegisterProcessModel value) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, value, this.createProcessRuntime());
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(java.lang.String businessKey, riskregister.process.RiskRegisterProcessModel value) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, riskregister.process.RiskRegisterProcessModel value) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public riskregister.process.RiskRegisterProcessModel createModel() {
        return new riskregister.process.RiskRegisterProcessModel();
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((riskregister.process.RiskRegisterProcessModel) value);
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (riskregister.process.RiskRegisterProcessModel) value);
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("RiskRegisterProcess", true);
        factory.variable("riskRegister", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.RiskRegister.class), java.util.Map.of("riskRegister", "riskRegister", "_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "ItemSubjectRef", "_4517EF33-52BA-4429-A6E1-BEBCA977125F"));
        factory.variable("approval", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.Approval.class), java.util.Map.of("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "approval", "approval", "ItemSubjectRef", "_53523FEA-307E-48B1-9B92-0057F604F3EA"));
        factory.variable("approvalLog", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.ApprovalLog.class), java.util.Map.of("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "approvalLog", "approvalLog", "ItemSubjectRef", "_F61432FD-5A02-4136-AD4D-B7123B649869"));
        factory.variable("divHeadUserGroup", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("divHeadUserGroup", "divHeadUserGroup", "_6C762736-9461-4A3F-BA68-E211AF240896", "divHeadUserGroup", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("divHeadUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("divHeadUsers", "divHeadUsers", "_A9BBE1F9-5046-46A3-A8DF-7969CD6929F5", "divHeadUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("makerUser", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("makerUser", "makerUser", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2", "_0A69832C-F1E9-4BB1-BAAD-6CFAE72FCAB0", "makerUser"));
        factory.variable("jroUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("jroUsers", "jroUsers", "_DCABA936-4C64-40B0-BFF0-6904A9C3F6C9", "jroUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("sroUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("sroUsers", "sroUsers", "_4C10A397-C411-48BF-8311-3E2C69A94CD5", "sroUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("hodUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("_688820A6-CDE1-4A90-BBD4-73B501638AF3", "hodUsers", "hodUsers", "hodUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("rmdUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("_00199562-25E4-4250-8DB7-2C443F615D58", "rmdUsers", "rmdUsers", "rmdUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("riskRegisterFactory", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.RiskRegisterFactory.class), java.util.Map.of("_93FA5B7B-1728-4824-A7E6-6B40F8F5C8DE", "riskRegisterFactory", "riskRegisterFactory", "riskRegisterFactory", "ItemSubjectRef", "_93FA3769-CF4E-4B96-BC1D-97C6D0E870B4"));
        factory.name("RiskRegisterProcess");
        factory.packageName("riskregister.process");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("jbpm.enable.multi.con", null);
        factory.metaData("jbpm.transactions.enable", "true");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
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
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), "_4FA8CE12-E261-4A07-A2F3-F01C39CA2C7A", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), "_965D5D98-4199-4BFA-A4B9-9C4B5DC8B6A2", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.done();
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), "_4FA8CE12-E261-4A07-A2F3-F01C39CA2C7A", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), "_965D5D98-4199-4BFA-A4B9-9C4B5DC8B6A2", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"));
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.name("Need Correction?");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.type(2);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.metaData("UniqueId", "_F8071055-52F6-4F5D-BE9E-00C51CC97456");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.metaData("elementname", "Need Correction?");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.metaData("Default", "_2A630041-EB7E-4471-83AC-2E51204405EE");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), "_2A630041-EB7E-4471-83AC-2E51204405EE", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), "_BFB8D2DF-5878-49D3-B39D-FCCEE7647AFF", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.done();
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), "_2A630041-EB7E-4471-83AC-2E51204405EE", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), "_BFB8D2DF-5878-49D3-B39D-FCCEE7647AFF", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"));
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.name("Need Correction?");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.type(2);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.metaData("UniqueId", "_B1CA7113-6053-4EB8-A714-F214C0D1E051");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.metaData("elementname", "Need Correction?");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.metaData("Default", "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), "_3D88550D-81D4-4256-90D2-49E5EBAC4C54", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.done();
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), "_3D88550D-81D4-4256-90D2-49E5EBAC4C54", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
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
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B0D002C4-2DFE-4F34-B75D-D684C307014D"));
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.name("Assign Approvers");
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.metaData("UniqueId", "_B0D002C4-2DFE-4F34-B75D-D684C307014D");
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.metaData("NodeType", "ScriptTask");
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.action(kcontext -> {
            riskregister.model.Approval approval = (riskregister.model.Approval) kcontext.getVariable("approval");
            java.lang.String divHeadUserGroup = (java.lang.String) kcontext.getVariable("divHeadUserGroup");
            java.lang.String divHeadUsers = (java.lang.String) kcontext.getVariable("divHeadUsers");
            java.lang.String makerUser = (java.lang.String) kcontext.getVariable("makerUser");
            java.lang.String jroUsers = (java.lang.String) kcontext.getVariable("jroUsers");
            java.lang.String sroUsers = (java.lang.String) kcontext.getVariable("sroUsers");
            java.lang.String hodUsers = (java.lang.String) kcontext.getVariable("hodUsers");
            java.lang.String rmdUsers = (java.lang.String) kcontext.getVariable("rmdUsers");
            makerUser = approval.getUserId();
            if (makerUser.contains("div1")) {
                divHeadUsers = "div1_head1,div1_head2";
                divHeadUserGroup = "DIV1_HEAD";
            } else if (makerUser.contains("div2")) {
                divHeadUsers = "div2_head1,div2_head2";
                divHeadUserGroup = "DIV2_HEAD";
            } else if (makerUser.contains("div3")) {
                divHeadUsers = "div3_head1,div3_head2";
                divHeadUserGroup = "DIV3_HEAD";
            }
            kcontext.setVariable("divHeadUsers", divHeadUsers);
            kcontext.setVariable("divHeadUserGroup", divHeadUserGroup);
            kcontext.setVariable("sroUsers", "sro1,sro2");
            kcontext.setVariable("jroUsers", "jro1,jro2");
            kcontext.setVariable("hodUsers", "hod1,hod2");
            kcontext.setVariable("rmdUsers", "rmd1,rmd2");
        });
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_0A87A8D7_2339_4201_8BE6_79E8ADF30572 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_0A87A8D7-2339-4201-8BE6-79E8ADF30572"));
        actionNode_0A87A8D7_2339_4201_8BE6_79E8ADF30572.name("Initialise");
        actionNode_0A87A8D7_2339_4201_8BE6_79E8ADF30572.metaData("UniqueId", "_0A87A8D7-2339-4201-8BE6-79E8ADF30572");
        actionNode_0A87A8D7_2339_4201_8BE6_79E8ADF30572.metaData("NodeType", "ScriptTask");
        actionNode_0A87A8D7_2339_4201_8BE6_79E8ADF30572.action(kcontext -> {
            riskregister.model.RiskRegister riskRegister = (riskregister.model.RiskRegister) kcontext.getVariable("riskRegister");
            riskRegister = riskregister.model.RiskRegisterFactory.getInstance();
            kcontext.setVariable("riskRegister", riskRegister);
        });
        actionNode_0A87A8D7_2339_4201_8BE6_79E8ADF30572.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_F37DF12F_2C90_4492_BB4F_102047D35890 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F37DF12F-2C90-4492-BB4F-102047D35890"));
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.name("Start");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.interrupting(false);
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.metaData("UniqueId", "_F37DF12F-2C90-4492-BB4F-102047D35890");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.metaData("EventType", "none");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.metaData("Lane", "Maker");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.name("SRO Submit RR");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("ActorId", "#{sroUsers}");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("GroupId", "SRO");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("NodeName", "SRO Submit RR");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("TaskName", "SROSubmitRR");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("UNIQUE_TASK_ID", "_1C18E257-48C8-4832-91D9-C1FCC57190C5");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_A13D999C-277E-490F-A0F5-F8ABAEB398BA", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_F05E7F74-D950-4E02-802F-CB790ED15A4B", "EXPRESSION (SRO)", "java.lang.Object", "SRO"), new org.jbpm.workflow.core.impl.DataDefinition("_A13D999C-277E-490F-A0F5-F8ABAEB398BA", "GroupId", "String", null))), null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_52E65051-EEA6-421E-A286-2EE7408999A9", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_36773F97-25ED-48FE-816A-2B82E44168A6", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_85990841-B0A7-48BB-BF89-DD313BA9CAFD", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_698FC4AF-E5D7-40E5-8AEE-F75909955A3F", "TaskName", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_537CE0F1-7B05-400F-825B-C46175C9EE90", "EXPRESSION (SROSubmitRR)", "java.lang.Object", "SROSubmitRR"), new org.jbpm.workflow.core.impl.DataDefinition("_698FC4AF-E5D7-40E5-8AEE-F75909955A3F", "TaskName", "String", null))), null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_31444F7A-8E34-482A-8FBE-7EEEFB23AAFA", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_DAA0E8A4-E8CA-4F5B-A8F8-DC988D78E9DA", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.done();
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.metaData("UniqueId", "_1C18E257-48C8-4832-91D9-C1FCC57190C5");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.name("HOD Approve");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("ActorId", "#{hodUsers}");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("GroupId", "HOD");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("NodeName", "HOD Approve");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("TaskName", "HODApprove");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("UNIQUE_TASK_ID", "_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_2F9F69C1-004E-4228-B793-93B5F9B36EF5", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_5C13FBB3-9282-4A54-A716-44CEA7B6152B", "EXPRESSION (HOD)", "java.lang.Object", "HOD"), new org.jbpm.workflow.core.impl.DataDefinition("_2F9F69C1-004E-4228-B793-93B5F9B36EF5", "GroupId", "String", null))), null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_5DF45695-7FBA-4F78-8E8B-9EE602EDE918", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_D6A8C1CA-C345-4221-BAF0-DC42EF654C43", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_BCAAC534-7EE4-4261-892E-519C839D84BA", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_C4296B39-FCE1-49B4-9084-493A89B4BFF0", "TaskName", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_48A3EE6E-D519-4A5F-930E-9B5C5B97FDE7", "EXPRESSION (HODApprove)", "java.lang.Object", "HODApprove"), new org.jbpm.workflow.core.impl.DataDefinition("_C4296B39-FCE1-49B4-9084-493A89B4BFF0", "TaskName", "String", null))), null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_67853B8D-E97A-4661-BAC2-014569B7B32B", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_5F1C910C-2B45-4103-BEA8-0C9AC87004AD", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.done();
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.metaData("UniqueId", "_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7"));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.name("RMD Verify RR");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("ActorId", "#{rmdUsers}");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("GroupId", "RMD");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("NodeName", "RMD Verify RR");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("UNIQUE_TASK_ID", "_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_59D2A2B7-17D6-4988-A126-07CFB6006973", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_A78FEF87-4EBD-454C-B8D4-4AFDA7A2CE5F", "EXPRESSION (RMD)", "java.lang.Object", "RMD"), new org.jbpm.workflow.core.impl.DataDefinition("_59D2A2B7-17D6-4988-A126-07CFB6006973", "GroupId", "String", null))), null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_1D1253E2-A418-405C-9BC8-0C36F1EE6C99", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_B8061D24-20D6-43DA-B045-945CF984DAAF", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_152FC4C4-8D7F-4D9F-8351-F44119C8B6B2", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_E58287D6-89FA-4C18-914D-C35B161CE103", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_9EA392A1-F138-4ACE-8692-89D50690EBCE", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.done();
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.metaData("UniqueId", "_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DB6511C3-530F-4D9B-B789-1D8DC62AEE70"));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.name("Maker Submit RR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("ActorId", "div1_maker1,div2_maker1,div3_maker2");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("GroupId", "MAKER");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("NodeName", "Maker Submit RR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("TaskName", "MakerSubmitRR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("UNIQUE_TASK_ID", "_DB6511C3-530F-4D9B-B789-1D8DC62AEE70");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_0DC0C5E3-AEA6-4A7A-9DEB-632076A98852", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_3A3DD022-64EF-48F0-B60D-D22951429F19", "TaskName", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_191003AF-177E-419F-87E4-5364C54649AF", "EXPRESSION (MakerSubmitRR)", "java.lang.Object", "MakerSubmitRR"), new org.jbpm.workflow.core.impl.DataDefinition("_3A3DD022-64EF-48F0-B60D-D22951429F19", "TaskName", "String", null))), null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_6D35C275-CE91-45F9-A291-4E155A484A5A", "approvalLog", "riskregister.model.ApprovalLog", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_1CFC7DFB-4DFF-4A90-973D-1AA2C06455AB", "EXPRESSION (approvalLog)", "java.lang.Object", "approvalLog"), new org.jbpm.workflow.core.impl.DataDefinition("_6D35C275-CE91-45F9-A291-4E155A484A5A", "approvalLog", "riskregister.model.ApprovalLog", null))), null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_8FFEEC5F-0ADE-4449-A8E0-414224D45EF4", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_A217A91D-63E8-45DD-BFD4-0FE0CA6BFD38", "EXPRESSION (MAKER)", "java.lang.Object", "MAKER"), new org.jbpm.workflow.core.impl.DataDefinition("_8FFEEC5F-0ADE-4449-A8E0-414224D45EF4", "GroupId", "String", null))), null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_5427329E-7BBE-4DC2-BDF6-60F97760B21A", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_CBE3D819-E3E8-49E8-88CD-88047E3AEB73", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_87FA5C02-394E-41D3-81B4-E651EA5B7253", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.done();
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.metaData("UniqueId", "_DB6511C3-530F-4D9B-B789-1D8DC62AEE70");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.metaData("elementname", "MakerSubmitRR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DE0A504F-8E6A-4BD7-8000-5DFFF2191422"));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.name("Div Head Verify RR");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("ActorId", "#{divHeadUsers}");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("GroupId", "divHeadUserGroup");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("NodeName", "Div Head Verify RR");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("TaskName", "DivHeadVerifyRR");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("UNIQUE_TASK_ID", "_DE0A504F-8E6A-4BD7-8000-5DFFF2191422");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_22471BB2-DAB7-4B2C-ABE5-940A3BD08FB8", "TaskName", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_9148F0C6-D46D-4466-98D1-C978F322D031", "EXPRESSION (DivHeadVerifyRR)", "java.lang.Object", "DivHeadVerifyRR"), new org.jbpm.workflow.core.impl.DataDefinition("_22471BB2-DAB7-4B2C-ABE5-940A3BD08FB8", "TaskName", "String", null))), null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_1A19A8A8-515B-414C-808F-D71389DDF353", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_9EC015F9-7BBD-443E-A708-89240A7E2B84", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_926A5902-9E55-47C2-B1D1-EA0EA5B7A6E8", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_F6AF3791-35F2-414F-8EA3-4C05E32E1991", "EXPRESSION (divHeadUserGroup)", "java.lang.Object", "divHeadUserGroup"), new org.jbpm.workflow.core.impl.DataDefinition("_926A5902-9E55-47C2-B1D1-EA0EA5B7A6E8", "GroupId", "String", null))), null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_5F49429B-B2FB-4436-A845-ABDF0C51B84B", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A8B31CF5-9537-4F8B-AD5F-2AF79447D05F", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_FBA291A1-4396-42A1-9B98-34E521EF829C", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.done();
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.metaData("UniqueId", "_DE0A504F-8E6A-4BD7-8000-5DFFF2191422");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.metaData("elementname", "Verify Risk Register");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.name("JRO Verify RR");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("ActorId", "#{jroUsers}");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("GroupId", "JRO");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("NodeName", "JRO Verify RR");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("TaskName", "JROVerifyRR");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("UNIQUE_TASK_ID", "_E82B11A3-F055-4091-AB9E-6869B67ACE6E");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_3F953B3F-7DD3-4820-8BDE-F1EC27B9AC31", "TaskName", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_51802A8C-4B48-47ED-BD4D-CE6B8616ACCE", "EXPRESSION (JROVerifyRR)", "java.lang.Object", "JROVerifyRR"), new org.jbpm.workflow.core.impl.DataDefinition("_3F953B3F-7DD3-4820-8BDE-F1EC27B9AC31", "TaskName", "String", null))), null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_975A82A0-9650-4ACE-B0B0-8CBCBE92F314", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_120898A7-5694-487D-9938-12A06B68F409", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_D93AE95F-8373-4FFA-999B-11E772ECF848", "EXPRESSION (JRO)", "java.lang.Object", "JRO"), new org.jbpm.workflow.core.impl.DataDefinition("_120898A7-5694-487D-9938-12A06B68F409", "GroupId", "String", null))), null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_481910E7-B783-4F89-8E6F-E0256EC02B67", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_F7CE15CC-4424-4FBE-ACD4-C37BA2A58100", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_E7FEC3F2-99B9-4B49-B2C7-C940D1F7C767", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.done();
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.metaData("UniqueId", "_E82B11A3-F055-4091-AB9E-6869B67ACE6E");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.metaData("elementname", "Verify Risk Register");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_D4D21E2A-9D22-4A2E-80DB-7E70D1232116"));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.name("HOD Verify RR");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("ActorId", "#{hodUsers}");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("GroupId", "HOD");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("NodeName", "HOD Verify RR");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("TaskName", "HODVerifyRR");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("UNIQUE_TASK_ID", "_D4D21E2A-9D22-4A2E-80DB-7E70D1232116");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_AFD50332-46B9-4EEE-A9DA-3396EE5E5FED", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_65FE347F-650F-4273-AE4C-67E0C6B69900", "EXPRESSION (HOD)", "java.lang.Object", "HOD"), new org.jbpm.workflow.core.impl.DataDefinition("_AFD50332-46B9-4EEE-A9DA-3396EE5E5FED", "GroupId", "String", null))), null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_F8079781-CAB1-4A41-A278-85E29F5B3FE9", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_82D0DD1C-7198-4E3C-ACF4-8D6CB3F63DC5", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_CE3A3468-09B4-48C9-97C5-41AA860C28C1", "TaskName", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_F25EBD35-585B-4F15-B203-EF47DDEB14C1", "EXPRESSION (HODVerifyRR)", "java.lang.Object", "HODVerifyRR"), new org.jbpm.workflow.core.impl.DataDefinition("_CE3A3468-09B4-48C9-97C5-41AA860C28C1", "TaskName", "String", null))), null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_238DE678-131D-4D6C-9707-F2F422830DB8", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_E653B4F6-63D1-4B59-BD48-830362014BC2", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.done();
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.metaData("UniqueId", "_D4D21E2A-9D22-4A2E-80DB-7E70D1232116");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.metaData("elementname", "HOD Verify RR");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B11A0D64-CFF4-4698-A0E7-B49B918B525C"), "_60261F81-B054-48FB-8C6B-D0D115CF0B2C");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DE0A504F-8E6A-4BD7-8000-5DFFF2191422"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"), "_3B74DA92-2E33-4655-92BD-E0529A7FFD9D");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"), "_F7343F91-D981-49CD-ACB2-ED1DC23CEB2A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_D4D21E2A-9D22-4A2E-80DB-7E70D1232116"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"), "_D3B6752D-76A8-417B-9A4E-45A70ABF5D6B");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_D7F5C003-3751-4C43-AE44-8175C80BE005");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_23E36111-18BE-4010-86A0-3F056BA17EF2");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_FF2F5065-D898-4E0F-A27E-36083B32BC85");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_0A87A8D7-2339-4201-8BE6-79E8ADF30572"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_D39D1838-CBB5-42DC-8C86-1B1578D51A60");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), "_965D5D98-4199-4BFA-A4B9-9C4B5DC8B6A2");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), "_BFB8D2DF-5878-49D3-B39D-FCCEE7647AFF");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), "_3D88550D-81D4-4256-90D2-49E5EBAC4C54");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DB6511C3-530F-4D9B-B789-1D8DC62AEE70"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B0D002C4-2DFE-4F34-B75D-D684C307014D"), "_0C4489CC-6562-4231-B3B3-6C3F7EC19F85");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F37DF12F-2C90-4492-BB4F-102047D35890"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_0A87A8D7-2339-4201-8BE6-79E8ADF30572"), "_DBE4DC0C-8A7C-465E-9CF8-C3AB5DA1C350");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), "_2A630041-EB7E-4471-83AC-2E51204405EE");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7"), "_D2F8F99E-BA9B-4D5A-829C-D10733E51485");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DB6511C3-530F-4D9B-B789-1D8DC62AEE70"), "_8BFB995A-EA2A-4665-AECC-E944E98D16A9");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B0D002C4-2DFE-4F34-B75D-D684C307014D"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DE0A504F-8E6A-4BD7-8000-5DFFF2191422"), "_E908193D-AABE-4F5E-90E2-B2FE2538ECA4");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), "_4FA8CE12-E261-4A07-A2F3-F01C39CA2C7A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_D4D21E2A-9D22-4A2E-80DB-7E70D1232116"), "_D129D052-ED50-4D11-9F52-FA98CD18CC6B");
        factory.validate();
        return factory.getProcess();
    }
}
