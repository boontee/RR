package riskregister.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Data container for risk rating impact scale related fields.
 *
 * Fields map to the provided form input types (all Text -> String):
 * - Control Execution Risk Impact
 * - Levels of Control Execution Risk Impact
 * - Monitoring Periodicity Risk Impact
 * - Nature of Controls Risk Impact
 * - Control Documentation & Dissemination Risk Impact
 */
public class RiskControlMeasure implements Serializable {
    private static final long serialVersionUID = 1L;

    private String controlExecutionRiskImpact = "";
    private String levelsOfControlExecutionRiskImpact = "";
    private String monitoringPeriodicityRiskImpact = "";
    private String natureOfControlsRiskImpact = "";
    private String controlDocumentationAndDisseminationRiskImpact = "";
    // Control Description - Text
    private String controlDescription = "";

    public RiskControlMeasure() {
    }

    public RiskControlMeasure(String controlExecutionRiskImpact,
                                 String levelsOfControlExecutionRiskImpact,
                                 String monitoringPeriodicityRiskImpact,
                                 String natureOfControlsRiskImpact,
                                 String controlDocumentationAndDisseminationRiskImpact,
                                 String controlDescription) {
        this.controlExecutionRiskImpact = controlExecutionRiskImpact;
        this.levelsOfControlExecutionRiskImpact = levelsOfControlExecutionRiskImpact;
        this.monitoringPeriodicityRiskImpact = monitoringPeriodicityRiskImpact;
        this.natureOfControlsRiskImpact = natureOfControlsRiskImpact;
        this.controlDocumentationAndDisseminationRiskImpact = controlDocumentationAndDisseminationRiskImpact;
        this.controlDescription = controlDescription;
    }

    public String getControlExecutionRiskImpact() {
        return controlExecutionRiskImpact;
    }

    public void setControlExecutionRiskImpact(String controlExecutionRiskImpact) {
        this.controlExecutionRiskImpact = controlExecutionRiskImpact;
    }

    public String getLevelsOfControlExecutionRiskImpact() {
        return levelsOfControlExecutionRiskImpact;
    }

    public void setLevelsOfControlExecutionRiskImpact(String levelsOfControlExecutionRiskImpact) {
        this.levelsOfControlExecutionRiskImpact = levelsOfControlExecutionRiskImpact;
    }

    public String getMonitoringPeriodicityRiskImpact() {
        return monitoringPeriodicityRiskImpact;
    }

    public void setMonitoringPeriodicityRiskImpact(String monitoringPeriodicityRiskImpact) {
        this.monitoringPeriodicityRiskImpact = monitoringPeriodicityRiskImpact;
    }

    public String getNatureOfControlsRiskImpact() {
        return natureOfControlsRiskImpact;
    }

    public void setNatureOfControlsRiskImpact(String natureOfControlsRiskImpact) {
        this.natureOfControlsRiskImpact = natureOfControlsRiskImpact;
    }

    public String getControlDocumentationAndDisseminationRiskImpact() {
        return controlDocumentationAndDisseminationRiskImpact;
    }

    public void setControlDocumentationAndDisseminationRiskImpact(String controlDocumentationAndDisseminationRiskImpact) {
        this.controlDocumentationAndDisseminationRiskImpact = controlDocumentationAndDisseminationRiskImpact;
    }

    public String getControlDescription() {
        return controlDescription;
    }

    public void setControlDescription(String controlDescription) {
        this.controlDescription = controlDescription;
    }

    @Override
    public String toString() {
    return "RiskControlMeasure{" +
        "controlExecutionRiskImpact='" + controlExecutionRiskImpact + '\'' +
        ", levelsOfControlExecutionRiskImpact='" + levelsOfControlExecutionRiskImpact + '\'' +
        ", monitoringPeriodicityRiskImpact='" + monitoringPeriodicityRiskImpact + '\'' +
        ", natureOfControlsRiskImpact='" + natureOfControlsRiskImpact + '\'' +
        ", controlDocumentationAndDisseminationRiskImpact='" + controlDocumentationAndDisseminationRiskImpact + '\'' +
        ", controlDescription='" + controlDescription + '\'' +
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiskControlMeasure that = (RiskControlMeasure) o;
    return Objects.equals(controlExecutionRiskImpact, that.controlExecutionRiskImpact) &&
        Objects.equals(levelsOfControlExecutionRiskImpact, that.levelsOfControlExecutionRiskImpact) &&
        Objects.equals(monitoringPeriodicityRiskImpact, that.monitoringPeriodicityRiskImpact) &&
        Objects.equals(natureOfControlsRiskImpact, that.natureOfControlsRiskImpact) &&
        Objects.equals(controlDocumentationAndDisseminationRiskImpact, that.controlDocumentationAndDisseminationRiskImpact) &&
        Objects.equals(controlDescription, that.controlDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlExecutionRiskImpact, levelsOfControlExecutionRiskImpact, monitoringPeriodicityRiskImpact, natureOfControlsRiskImpact, controlDocumentationAndDisseminationRiskImpact, controlDescription);
    }
}
