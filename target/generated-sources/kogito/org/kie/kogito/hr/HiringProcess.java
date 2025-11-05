package org.kie.kogito.hr;

import org.kie.kogito.hr.HiringModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;
import org.jbpm.process.core.datatype.impl.type.IntegerDataType;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("hiring")
@io.quarkus.runtime.Startup()
public class HiringProcess extends org.kie.kogito.process.impl.AbstractProcess<org.kie.kogito.hr.HiringModel> {

    @jakarta.inject.Inject()
    public HiringProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        super(app, java.util.Arrays.asList(), correlations, factory);
        activate();
    }

    public HiringProcess() {
    }

    @Override()
    public org.kie.kogito.hr.HiringProcessInstance createInstance(org.kie.kogito.hr.HiringModel value) {
        return new org.kie.kogito.hr.HiringProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.kie.kogito.hr.HiringProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.hr.HiringModel value) {
        return new org.kie.kogito.hr.HiringProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.kie.kogito.hr.HiringProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.kie.kogito.hr.HiringModel value) {
        return new org.kie.kogito.hr.HiringProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.kie.kogito.hr.HiringModel createModel() {
        return new org.kie.kogito.hr.HiringModel();
    }

    public org.kie.kogito.hr.HiringProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.kie.kogito.hr.HiringModel) value);
    }

    public org.kie.kogito.hr.HiringProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.kie.kogito.hr.HiringModel) value);
    }

    public org.kie.kogito.hr.HiringProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kie.kogito.hr.HiringProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.kie.kogito.hr.HiringProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kie.kogito.hr.HiringProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("hiring", true);
        factory.variable("hr_approval", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("customTags", "internal", "ItemSubjectRef", "_hr_approvalItem", "hr_approval", "hr_approval"));
        factory.variable("it_approval", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("customTags", "internal", "it_approval", "it_approval", "ItemSubjectRef", "_it_approvalItem"));
        factory.variable("offer", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Integer.class), java.util.Map.of("offer", "offer", "customTags", "output", "ItemSubjectRef", "_offerItem"));
        factory.variable("skills", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("skills", "skills", "customTags", "input", "ItemSubjectRef", "_skillsItem"));
        factory.variable("experience", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Integer.class), java.util.Map.of("customTags", "input", "experience", "experience", "ItemSubjectRef", "_experienceItem"));
        factory.variable("category", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("customTags", "output", "category", "category", "ItemSubjectRef", "_categoryItem"));
        factory.variable("salary", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Integer.class), java.util.Map.of("customTags", "output", "salary", "salary", "ItemSubjectRef", "_salaryItem"));
        factory.variable("bonus", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Integer.class), java.util.Map.of("customTags", "output", "bonus", "bonus", "ItemSubjectRef", "_bonusItem"));
        factory.variable("candidate", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("candidate", "candidate", "customTags", "input", "ItemSubjectRef", "_candidateItem"));
        factory.variable("user", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("_D5C41BAF-9177-4B73-9981-1F4C1B90B9E7", "user", "user", "user", "ItemSubjectRef", "__8962C15F-55EC-46F7-B926-5D5A1FD8D35E_categoryInputXItem"));
        factory.variable("itGroup", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("itGroup", "itGroup", "_978BBD23-0FDF-47C7-BF6E-0290CCF85C42", "itGroup", "ItemSubjectRef", "__8962C15F-55EC-46F7-B926-5D5A1FD8D35E_categoryInputXItem"));
        factory.variable("hrGroup", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("hrGroup", "hrGroup", "_D05480F2-CE6A-4D8F-93E6-656191E3EF0F", "hrGroup", "ItemSubjectRef", "__8962C15F-55EC-46F7-B926-5D5A1FD8D35E_categoryInputXItem"));
        factory.name("hiring");
        factory.packageName("org.kie.kogito.hr");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("jbpm.enable.multi.con", null);
        factory.metaData("jbpm.transactions.enable", "true");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.BoundaryEventNodeFactory<?> boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B = factory.boundaryEventNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_116F3C54-A10E-4952-9E08-1CACE74CED0B"));
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.metaData("UniqueId", "_116F3C54-A10E-4952-9E08-1CACE74CED0B");
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.metaData("EventType", "timer");
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.metaData("x", 688);
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.metaData("width", 56);
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.metaData("y", 86);
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.metaData("AttachedTo", "_B8C4F63C-81AD-4291-9C1B-84967277EEF6");
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.metaData("TimeDuration", "PT180S");
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.metaData("CancelActivity", true);
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.metaData("height", 56);
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.name("BoundaryEvent");
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.eventType("Timer-_B8C4F63C-81AD-4291-9C1B-84967277EEF6-PT180S-_116F3C54-A10E-4952-9E08-1CACE74CED0B");
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.attachedTo("_B8C4F63C-81AD-4291-9C1B-84967277EEF6");
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.scope(null);
        boundaryEventNode_116F3C54_A10E_4952_9E08_1CACE74CED0B.done();
        org.jbpm.ruleflow.core.factory.BoundaryEventNodeFactory<?> boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D = factory.boundaryEventNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B375FFE6-D0A8-4E4F-A7AA-8B1E8B861E0D"));
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.metaData("UniqueId", "_B375FFE6-D0A8-4E4F-A7AA-8B1E8B861E0D");
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.metaData("EventType", "timer");
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.metaData("x", 896);
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.metaData("width", 56);
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.metaData("y", 86);
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.metaData("AttachedTo", "_8962C15F-55EC-46F7-B926-5D5A1FD8D35E");
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.metaData("TimeDuration", "PT180S");
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.metaData("CancelActivity", true);
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.metaData("height", 56);
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.name("BoundaryEvent");
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.eventType("Timer-_8962C15F-55EC-46F7-B926-5D5A1FD8D35E-PT180S-_B375FFE6-D0A8-4E4F-A7AA-8B1E8B861E0D");
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.attachedTo("_8962C15F-55EC-46F7-B926-5D5A1FD8D35E");
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.scope(null);
        boundaryEventNode_B375FFE6_D0A8_4E4F_A7AA_8B1E8B861E0D.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_6CE52250_BCEE_485C_8AE4_F6CACF2EF5A1 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6CE52250-BCEE-485C-8AE4-F6CACF2EF5A1"));
        endNode_6CE52250_BCEE_485C_8AE4_F6CACF2EF5A1.name("End");
        endNode_6CE52250_BCEE_485C_8AE4_F6CACF2EF5A1.terminate(false);
        endNode_6CE52250_BCEE_485C_8AE4_F6CACF2EF5A1.metaData("UniqueId", "_6CE52250-BCEE-485C-8AE4-F6CACF2EF5A1");
        endNode_6CE52250_BCEE_485C_8AE4_F6CACF2EF5A1.metaData("x", 1328);
        endNode_6CE52250_BCEE_485C_8AE4_F6CACF2EF5A1.metaData("width", 56);
        endNode_6CE52250_BCEE_485C_8AE4_F6CACF2EF5A1.metaData("y", 35);
        endNode_6CE52250_BCEE_485C_8AE4_F6CACF2EF5A1.metaData("height", 56);
        endNode_6CE52250_BCEE_485C_8AE4_F6CACF2EF5A1.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_457DC13A_0AEC_4390_A860_5CCFFB67B366 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_457DC13A-0AEC-4390-A860-5CCFFB67B366"));
        endNode_457DC13A_0AEC_4390_A860_5CCFFB67B366.name("End");
        endNode_457DC13A_0AEC_4390_A860_5CCFFB67B366.terminate(false);
        endNode_457DC13A_0AEC_4390_A860_5CCFFB67B366.metaData("UniqueId", "_457DC13A-0AEC-4390-A860-5CCFFB67B366");
        endNode_457DC13A_0AEC_4390_A860_5CCFFB67B366.metaData("x", 1329);
        endNode_457DC13A_0AEC_4390_A860_5CCFFB67B366.metaData("width", 56);
        endNode_457DC13A_0AEC_4390_A860_5CCFFB67B366.metaData("y", 392);
        endNode_457DC13A_0AEC_4390_A860_5CCFFB67B366.metaData("height", 56);
        endNode_457DC13A_0AEC_4390_A860_5CCFFB67B366.done();
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_F1B20FAB_EDDC_4114_8AE8_B00E3F94975E = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F1B20FAB-EDDC-4114-8AE8-B00E3F94975E"));
        joinNode_F1B20FAB_EDDC_4114_8AE8_B00E3F94975E.name("Join");
        joinNode_F1B20FAB_EDDC_4114_8AE8_B00E3F94975E.type(2);
        joinNode_F1B20FAB_EDDC_4114_8AE8_B00E3F94975E.metaData("UniqueId", "_F1B20FAB-EDDC-4114-8AE8-B00E3F94975E");
        joinNode_F1B20FAB_EDDC_4114_8AE8_B00E3F94975E.metaData("x", 795);
        joinNode_F1B20FAB_EDDC_4114_8AE8_B00E3F94975E.metaData("width", 56);
        joinNode_F1B20FAB_EDDC_4114_8AE8_B00E3F94975E.metaData("y", 196);
        joinNode_F1B20FAB_EDDC_4114_8AE8_B00E3F94975E.metaData("height", 56);
        joinNode_F1B20FAB_EDDC_4114_8AE8_B00E3F94975E.done();
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_30C8C01B_4149_4AE5_8D86_D27D57BCA8E7 = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_30C8C01B-4149-4AE5-8D86-D27D57BCA8E7"));
        joinNode_30C8C01B_4149_4AE5_8D86_D27D57BCA8E7.name("Join");
        joinNode_30C8C01B_4149_4AE5_8D86_D27D57BCA8E7.type(2);
        joinNode_30C8C01B_4149_4AE5_8D86_D27D57BCA8E7.metaData("UniqueId", "_30C8C01B-4149-4AE5-8D86-D27D57BCA8E7");
        joinNode_30C8C01B_4149_4AE5_8D86_D27D57BCA8E7.metaData("x", 1032);
        joinNode_30C8C01B_4149_4AE5_8D86_D27D57BCA8E7.metaData("width", 56);
        joinNode_30C8C01B_4149_4AE5_8D86_D27D57BCA8E7.metaData("y", 392);
        joinNode_30C8C01B_4149_4AE5_8D86_D27D57BCA8E7.metaData("height", 56);
        joinNode_30C8C01B_4149_4AE5_8D86_D27D57BCA8E7.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A51A809E-03C0-4EA7-91F1-7B3C5E29AD04"));
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.name("Split");
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.type(2);
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.metaData("UniqueId", "_A51A809E-03C0-4EA7-91F1-7B3C5E29AD04");
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.metaData("x", 343);
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.metaData("width", 56);
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.metaData("y", 35);
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.metaData("Default", "_59F9A0E6-7F9C-43A9-8920-5B40A91169E6");
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.metaData("height", 56);
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_30C8C01B-4149-4AE5-8D86-D27D57BCA8E7"), "_C6E61C53-FD35-4347-B69E-30AA93AE4404", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Integer experience = (java.lang.Integer) kcontext.getVariable("experience");
            java.lang.String skills = (java.lang.String) kcontext.getVariable("skills");
            return experience < 1 || skills == null || skills.isEmpty();
        }, 0, false);
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.done();
        splitNode_A51A809E_03C0_4EA7_91F1_7B3C5E29AD04.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_30C8C01B-4149-4AE5-8D86-D27D57BCA8E7"), "_C6E61C53-FD35-4347-B69E-30AA93AE4404", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Integer experience = (java.lang.Integer) kcontext.getVariable("experience");
            java.lang.String skills = (java.lang.String) kcontext.getVariable("skills");
            return experience < 1 || skills == null || skills.isEmpty();
        }, 0, false);
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B9662806-84F3-4444-AD62-4790CDA7C85D"));
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.name("Split");
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.type(2);
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.metaData("UniqueId", "_B9662806-84F3-4444-AD62-4790CDA7C85D");
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.metaData("x", 1032);
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.metaData("width", 56);
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.metaData("y", 35);
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.metaData("Default", "_B7FC63DD-C08F-4CB3-A51A-79C1B8B18E6E");
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.metaData("height", 56);
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_940F2A0C-8CC6-4ECA-B504-49363AF68B67"), "_B11455DE-F77A-4251-A85B-4C66636E3CD9", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean it_approval = (java.lang.Boolean) kcontext.getVariable("it_approval");
            java.lang.Boolean hr_approval = (java.lang.Boolean) kcontext.getVariable("hr_approval");
            return hr_approval && it_approval;
        }, 0, false);
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.done();
        splitNode_B9662806_84F3_4444_AD62_4790CDA7C85D.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_940F2A0C-8CC6-4ECA-B504-49363AF68B67"), "_B11455DE-F77A-4251-A85B-4C66636E3CD9", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean it_approval = (java.lang.Boolean) kcontext.getVariable("it_approval");
            java.lang.Boolean hr_approval = (java.lang.Boolean) kcontext.getVariable("hr_approval");
            return hr_approval && it_approval;
        }, 0, false);
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_940F2A0C-8CC6-4ECA-B504-49363AF68B67"));
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.name("Send Offer to Candidate");
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.metaData("UniqueId", "_940F2A0C-8CC6-4ECA-B504-49363AF68B67");
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.metaData("elementname", "Send Offer to Candidate");
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.metaData("NodeType", "ScriptTask");
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.metaData("x", 1134);
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.metaData("width", 154);
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.metaData("y", 12);
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.metaData("height", 102);
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.action(kcontext -> {
            java.lang.String category = (java.lang.String) kcontext.getVariable("category");
            java.lang.Integer salary = (java.lang.Integer) kcontext.getVariable("salary");
            java.lang.Integer bonus = (java.lang.Integer) kcontext.getVariable("bonus");
            java.lang.String candidate = (java.lang.String) kcontext.getVariable("candidate");
            System.out.println("###################################");
            System.out.println("To: " + candidate);
            System.out.println("Subject: Congratulations you made it!");
            System.out.println("Dear " + candidate + ", we are happy to tell you that you've successfully went through the hiring process. You'll find the final Offer details in attached.");
            System.out.println("Job Category: " + category);
            System.out.println("Base salary: " + salary + "$");
            System.out.println("Bonus: " + bonus + "$");
            System.out.println("###################################");
        });
        actionNode_940F2A0C_8CC6_4ECA_B504_49363AF68B67.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_57DBE42C-6850-4A08-AC73-2BB0FFDFCC8C"));
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.name("Create Offer");
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.metaData("UniqueId", "_57DBE42C-6850-4A08-AC73-2BB0FFDFCC8C");
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.metaData("elementname", "Create Offer");
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.metaData("NodeType", "ScriptTask");
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.metaData("x", 437);
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.metaData("width", 154);
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.metaData("y", 12);
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.metaData("height", 102);
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.action(kcontext -> {
            java.lang.Integer offer = (java.lang.Integer) kcontext.getVariable("offer");
            java.lang.String skills = (java.lang.String) kcontext.getVariable("skills");
            java.lang.Integer experience = (java.lang.Integer) kcontext.getVariable("experience");
            java.lang.String category = (java.lang.String) kcontext.getVariable("category");
            java.lang.Integer salary = (java.lang.Integer) kcontext.getVariable("salary");
            java.lang.Integer bonus = (java.lang.Integer) kcontext.getVariable("bonus");
            java.lang.String candidate = (java.lang.String) kcontext.getVariable("candidate");
            if (experience <= 5) {
                salary = 30000;
                category = "Software Engineer";
            } else if (experience <= 10) {
                salary = 40000;
                category = "Senior Software Engineer";
            } else {
                salary = 50000;
                category = "Software Architect";
            }
            bonus = skills.split(",").length * 150;
            kcontext.setVariable("category", category);
            kcontext.setVariable("salary", salary);
            kcontext.setVariable("bonus", bonus);
            System.out.println("###################################");
            System.out.println("Generated offer for candidate: " + candidate);
            System.out.println("Job Category: " + category);
            System.out.println("Base Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("###################################");
        });
        actionNode_57DBE42C_6850_4A08_AC73_2BB0FFDFCC8C.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4B7FF147-F096-435B-8CAF-48318EF786B0"));
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.name("Application denied");
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.metaData("UniqueId", "_4B7FF147-F096-435B-8CAF-48318EF786B0");
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.metaData("elementname", "Application denied");
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.metaData("NodeType", "ScriptTask");
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.metaData("x", 1134);
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.metaData("width", 154);
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.metaData("y", 369);
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.metaData("height", 102);
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.action(kcontext -> {
            java.lang.String candidate = (java.lang.String) kcontext.getVariable("candidate");
            System.out.println("###################################");
            System.out.println("Candidate " + candidate + " don't meet the requirements for the position but we'll keep it on records for the future!");
            System.out.println("###################################");
        });
        actionNode_4B7FF147_F096_435B_8CAF_48318EF786B0.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_834B21EF-9229-44F8-A5DB-D96EBB39A347"));
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.name("Send notification HR Interview avoided");
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.metaData("UniqueId", "_834B21EF-9229-44F8-A5DB-D96EBB39A347");
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.metaData("elementname", "Send notification HR Interview avoided");
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.metaData("NodeType", "ScriptTask");
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.metaData("x", 746);
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.metaData("width", 154);
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.metaData("y", 288);
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.metaData("height", 102);
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.action(kcontext -> {
            System.out.println("###################################");
            System.out.println("Interviews have been skipped after reasonable time");
            System.out.println("###################################");
        });
        actionNode_834B21EF_9229_44F8_A5DB_D96EBB39A347.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5BDBE48C-CC83-46A9-9D56-F846F8FC1045"));
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.name("New Hiring");
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.metaData("UniqueId", "_5BDBE48C-CC83-46A9-9D56-F846F8FC1045");
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.metaData("elementname", "New Hiring");
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.metaData("NodeType", "ScriptTask");
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.metaData("x", 162);
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.metaData("width", 154);
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.metaData("y", 12);
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.metaData("height", 102);
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.action(kcontext -> {
            java.lang.Boolean hr_approval = (java.lang.Boolean) kcontext.getVariable("hr_approval");
            java.lang.Boolean it_approval = (java.lang.Boolean) kcontext.getVariable("it_approval");
            java.lang.String candidate = (java.lang.String) kcontext.getVariable("candidate");
            java.lang.String user = (java.lang.String) kcontext.getVariable("user");
            java.lang.String itGroup = (java.lang.String) kcontext.getVariable("itGroup");
            java.lang.String hrGroup = (java.lang.String) kcontext.getVariable("hrGroup");
            System.out.println("New Hiring has been created for candidate: " + candidate);
            kcontext.setVariable("hr_approval", false);
            kcontext.setVariable("it_approval", false);
            kcontext.setVariable("itGroup", "IT");
            kcontext.setVariable("hrGroup", "HR");
            System.setProperty("org.jbpm.usergroup.callback", "utils.DynamicUserGroupCallback");
        });
        actionNode_5BDBE48C_CC83_46A9_9D56_F846F8FC1045.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1639F738-45F3-4CD6-A80E-CCEBAA605D56"));
        startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56.name("Start");
        startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56.interrupting(true);
        startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56.metaData("UniqueId", "_1639F738-45F3-4CD6-A80E-CCEBAA605D56");
        startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56.metaData("EventType", "none");
        startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56.metaData("x", 72);
        startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56.metaData("width", 56);
        startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56.metaData("y", 35);
        startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56.metaData("height", 56);
        startNode_1639F738_45F3_4CD6_A80E_CCEBAA605D56.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8962C15F-55EC-46F7-B926-5D5A1FD8D35E"));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.name("IT Interview");
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.workParameter("ActorId", "");
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.workParameter("GroupId", "itGroup");
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.workParameter("NodeName", "IT Interview");
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.workParameter("Skippable", "false");
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.workParameter("TaskName", "ITInterview");
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.workParameter("UNIQUE_TASK_ID", "_8962C15F-55EC-46F7-B926-5D5A1FD8D35E");
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_C3CEF004-AA05-4466-833D-460E8186E243", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("43301a64-78b6-4d40-8806-3b7fe4ce1894", "EXPRESSION (ITInterview)", "java.lang.Object", "ITInterview"), new org.jbpm.workflow.core.impl.DataDefinition("_C3CEF004-AA05-4466-833D-460E8186E243", "TaskName", "Object", null))), null));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("candidate", "candidate", "java.lang.String", null)), new org.jbpm.workflow.core.impl.DataDefinition("_4850715E-F9EB-4DB3-9466-9D2B4E621801", "candidate", "String", null), null, null));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("category", "category", "java.lang.String", null)), new org.jbpm.workflow.core.impl.DataDefinition("_98A06CA9-E4FF-4236-9B64-313F093E7235", "category", "String", null), null, null));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("it_approval", "it_approval", "java.lang.Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("_707BBC50-10D3-498D-82E8-5FA9F01FD94E", "approve", "Boolean", null), null, null));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("salary", "salary", "java.lang.Integer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_180EA0E9-0672-439D-8393-3A93F3EE9F84", "baseSalary", "Integer", null), null, null));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("bonus", "bonus", "java.lang.Integer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_DB5F54C1-819E-41DB-A7A2-2F630CF81178", "bonus", "Integer", null), null, null));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_49405A35-4485-471B-AD91-6BAD939113B1", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("c4e5e04f-5e6a-4868-b2dc-c1f706f5dad9", "EXPRESSION (false)", "java.lang.Object", "false"), new org.jbpm.workflow.core.impl.DataDefinition("_49405A35-4485-471B-AD91-6BAD939113B1", "Skippable", "Object", null))), null));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_F62E8988-35E4-4E8A-B9DA-C993BB2F8CC8", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("412490f8-53fe-4be0-b507-9ba146286a52", "EXPRESSION (itGroup)", "java.lang.Object", "itGroup"), new org.jbpm.workflow.core.impl.DataDefinition("_F62E8988-35E4-4E8A-B9DA-C993BB2F8CC8", "GroupId", "String", null))), null));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_2BFA80FC-1016-4D54-B953-D5183FD62DB6", "approve", "Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("it_approval", "it_approval", "java.lang.Boolean", null), null, null));
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.done();
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.metaData("UniqueId", "_8962C15F-55EC-46F7-B926-5D5A1FD8D35E");
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.metaData("elementname", "IT Interview");
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.metaData("x", 824);
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.metaData("width", 154);
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.metaData("y", 12);
        humanTaskNode_8962C15F_55EC_46F7_B926_5D5A1FD8D35E.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B8C4F63C-81AD-4291-9C1B-84967277EEF6"));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.name("HR Interview");
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.workParameter("ActorId", "");
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.workParameter("GroupId", "hrGroup");
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.workParameter("NodeName", "HR Interview");
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.workParameter("Skippable", "false");
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.workParameter("TaskName", "HRInterview");
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.workParameter("UNIQUE_TASK_ID", "_B8C4F63C-81AD-4291-9C1B-84967277EEF6");
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_673BF6D9-80CB-4CC3-BB25-4B1070AA17AE", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("1fb1de5d-ec4d-4358-bfab-7260c60fb013", "EXPRESSION (HRInterview)", "java.lang.Object", "HRInterview"), new org.jbpm.workflow.core.impl.DataDefinition("_673BF6D9-80CB-4CC3-BB25-4B1070AA17AE", "TaskName", "Object", null))), null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("candidate", "candidate", "java.lang.String", null)), new org.jbpm.workflow.core.impl.DataDefinition("_8430C98F-2324-4790-AE73-7EF97A226CC1", "candidate", "String", null), null, null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("hr_approval", "hr_approval", "java.lang.Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("_00F811F5-89BF-4970-BB70-592277372CF6", "approve", "Boolean", null), null, null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("category", "category", "java.lang.String", null)), new org.jbpm.workflow.core.impl.DataDefinition("_F6DDE58F-6497-4928-BFE6-9BF6487CF2A8", "category", "String", null), null, null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("salary", "salary", "java.lang.Integer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_437743D7-2677-4958-A014-182FA2CE3392", "baseSalary", "Integer", null), null, null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("bonus", "bonus", "java.lang.Integer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_05000B7E-C327-4F3A-A26F-99DF0B9272DE", "bonus", "Object", null), null, null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_EA81CFE7-49BB-48E2-AAD1-11B519882990", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("a363ca4d-2ea1-4a4c-af6b-1e2d1f060e4c", "EXPRESSION (false)", "java.lang.Object", "false"), new org.jbpm.workflow.core.impl.DataDefinition("_EA81CFE7-49BB-48E2-AAD1-11B519882990", "Skippable", "Object", null))), null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_16BD2E2E-1580-4C47-AF79-6B652163167C", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("66cf6e87-2133-420a-a906-7116516a7153", "EXPRESSION (hrGroup)", "java.lang.Object", "hrGroup"), new org.jbpm.workflow.core.impl.DataDefinition("_16BD2E2E-1580-4C47-AF79-6B652163167C", "GroupId", "String", null))), null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_96CA82EA-6A39-44DE-B5BE-0D89D05B05BE", "approve", "Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("hr_approval", "hr_approval", "java.lang.Boolean", null), null, null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_39B96C96-29A5-4C04-BD70-53C311A413A3", "category", "String", null)), new org.jbpm.workflow.core.impl.DataDefinition("category", "category", "java.lang.String", null), null, null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_28E65476-3327-462C-A3B3-655798EECE70", "baseSalary", "Integer", null)), new org.jbpm.workflow.core.impl.DataDefinition("salary", "salary", "java.lang.Integer", null), null, null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_F97E351F-8B23-4461-827F-0249A1E03C54", "bonus", "Integer", null)), new org.jbpm.workflow.core.impl.DataDefinition("bonus", "bonus", "java.lang.Integer", null), null, null));
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.done();
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.metaData("UniqueId", "_B8C4F63C-81AD-4291-9C1B-84967277EEF6");
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.metaData("elementname", "HR Interview");
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.metaData("x", 628);
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.metaData("width", 154);
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.metaData("y", 12);
        humanTaskNode_B8C4F63C_81AD_4291_9C1B_84967277EEF6.metaData("height", 102);
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_940F2A0C-8CC6-4ECA-B504-49363AF68B67"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6CE52250-BCEE-485C-8AE4-F6CACF2EF5A1"), "_7DDA574A-C220-4FEF-9784-22EF8052EDEC");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4B7FF147-F096-435B-8CAF-48318EF786B0"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_457DC13A-0AEC-4390-A860-5CCFFB67B366"), "_527D3164-4989-4D2C-B80B-9BA9D4C8FB89");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B375FFE6-D0A8-4E4F-A7AA-8B1E8B861E0D"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F1B20FAB-EDDC-4114-8AE8-B00E3F94975E"), "_C500BCB4-FBE1-43A0-A7C8-5F72670CD927");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_116F3C54-A10E-4952-9E08-1CACE74CED0B"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F1B20FAB-EDDC-4114-8AE8-B00E3F94975E"), "_7B41F971-C74D-4036-8A5E-EFF81C37986A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A51A809E-03C0-4EA7-91F1-7B3C5E29AD04"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_30C8C01B-4149-4AE5-8D86-D27D57BCA8E7"), "_C6E61C53-FD35-4347-B69E-30AA93AE4404");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B9662806-84F3-4444-AD62-4790CDA7C85D"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_30C8C01B-4149-4AE5-8D86-D27D57BCA8E7"), "_B7FC63DD-C08F-4CB3-A51A-79C1B8B18E6E");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_834B21EF-9229-44F8-A5DB-D96EBB39A347"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_30C8C01B-4149-4AE5-8D86-D27D57BCA8E7"), "_5334FFDC-1FCB-47E6-8085-36DC9A3D17B9");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5BDBE48C-CC83-46A9-9D56-F846F8FC1045"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A51A809E-03C0-4EA7-91F1-7B3C5E29AD04"), "_5162ABF0-DD2E-4BDC-9A46-DDCFCB010287");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8962C15F-55EC-46F7-B926-5D5A1FD8D35E"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B9662806-84F3-4444-AD62-4790CDA7C85D"), "_C62F7EFB-A009-450A-81C7-57D36F0DF766");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B9662806-84F3-4444-AD62-4790CDA7C85D"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_940F2A0C-8CC6-4ECA-B504-49363AF68B67"), "_B11455DE-F77A-4251-A85B-4C66636E3CD9");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A51A809E-03C0-4EA7-91F1-7B3C5E29AD04"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_57DBE42C-6850-4A08-AC73-2BB0FFDFCC8C"), "_59F9A0E6-7F9C-43A9-8920-5B40A91169E6");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_30C8C01B-4149-4AE5-8D86-D27D57BCA8E7"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4B7FF147-F096-435B-8CAF-48318EF786B0"), "_94172225-E124-4F14-98DA-C3D62C11254A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F1B20FAB-EDDC-4114-8AE8-B00E3F94975E"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_834B21EF-9229-44F8-A5DB-D96EBB39A347"), "_730573E5-BCD9-42BC-9AC8-AE003784831D");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1639F738-45F3-4CD6-A80E-CCEBAA605D56"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5BDBE48C-CC83-46A9-9D56-F846F8FC1045"), "_8863B46B-9B0F-40B9-AAB1-A7503CF9AA0A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B8C4F63C-81AD-4291-9C1B-84967277EEF6"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8962C15F-55EC-46F7-B926-5D5A1FD8D35E"), "_A76C6603-0406-423C-940B-3403948DCA1F");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_57DBE42C-6850-4A08-AC73-2BB0FFDFCC8C"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B8C4F63C-81AD-4291-9C1B-84967277EEF6"), "_ACEE7578-B7D2-4EDF-B104-9ECF3DD8A383");
        factory.validate();
        return factory.getProcess();
    }
}
