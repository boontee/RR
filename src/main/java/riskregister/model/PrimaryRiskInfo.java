package riskregister.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Data container for the primary risk information form.
 *
 * Fields map to the provided form input types:
 * - Select Financial Year: Date -> LocalDate
 * - Risk Reported By: Text -> String
 * - Department: Text -> String
 * - Select Division: DropDown -> String (selected value)
 * - Select Process Type: Radio Button -> String (selected value)
 * - Process Name: Text -> String
 * - Objective of the Process: Text -> String
 * - Risk DescriptionPerceived Inherent Risk: Text -> String
 */
public class PrimaryRiskInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    // Select Financial Year - Date
    private LocalDate financialYear;

    // Risk Reported By - Text
    private String riskReportedBy = "";

    // Department - Text
    private String department = "";

    // Select Division - DropDown
    private String division = "";

    // Select Process Type - Radio Button
    private String processType = "";

    // Process Name - Text
    private String processName = "";

    // Objective of the Process - Text
    private String objectiveOfProcess = "";

    // Risk DescriptionPerceived Inherent Risk - Text
    private String riskDescriptionPerceivedInherentRisk = "";

    public PrimaryRiskInfo() {
    }

    public PrimaryRiskInfo(LocalDate financialYear,
                           String riskReportedBy,
                           String department,
                           String division,
                           String processType,
                           String processName,
                           String objectiveOfProcess,
                           String riskDescriptionPerceivedInherentRisk) {
        this.financialYear = financialYear;
        this.riskReportedBy = riskReportedBy;
        this.department = department;
        this.division = division;
        this.processType = processType;
        this.processName = processName;
        this.objectiveOfProcess = objectiveOfProcess;
        this.riskDescriptionPerceivedInherentRisk = riskDescriptionPerceivedInherentRisk;
    }

    public LocalDate getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(LocalDate financialYear) {
        this.financialYear = financialYear;
    }

    public String getRiskReportedBy() {
        return riskReportedBy;
    }

    public void setRiskReportedBy(String riskReportedBy) {
        this.riskReportedBy = riskReportedBy;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getObjectiveOfProcess() {
        return objectiveOfProcess;
    }

    public void setObjectiveOfProcess(String objectiveOfProcess) {
        this.objectiveOfProcess = objectiveOfProcess;
    }

    public String getRiskDescriptionPerceivedInherentRisk() {
        return riskDescriptionPerceivedInherentRisk;
    }

    public void setRiskDescriptionPerceivedInherentRisk(String riskDescriptionPerceivedInherentRisk) {
        this.riskDescriptionPerceivedInherentRisk = riskDescriptionPerceivedInherentRisk;
    }

    @Override
    public String toString() {
        return "PrimaryRiskInfo{" +
                "financialYear=" + financialYear +
                ", riskReportedBy='" + riskReportedBy + '\'' +
                ", department='" + department + '\'' +
                ", division='" + division + '\'' +
                ", processType='" + processType + '\'' +
                ", processName='" + processName + '\'' +
                ", objectiveOfProcess='" + objectiveOfProcess + '\'' +
                ", riskDescriptionPerceivedInherentRisk='" + riskDescriptionPerceivedInherentRisk + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimaryRiskInfo that = (PrimaryRiskInfo) o;
        return Objects.equals(financialYear, that.financialYear) &&
                Objects.equals(riskReportedBy, that.riskReportedBy) &&
                Objects.equals(department, that.department) &&
                Objects.equals(division, that.division) &&
                Objects.equals(processType, that.processType) &&
                Objects.equals(processName, that.processName) &&
                Objects.equals(objectiveOfProcess, that.objectiveOfProcess) &&
                Objects.equals(riskDescriptionPerceivedInherentRisk, that.riskDescriptionPerceivedInherentRisk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(financialYear, riskReportedBy, department, division, processType, processName, objectiveOfProcess, riskDescriptionPerceivedInherentRisk);
    }
}
