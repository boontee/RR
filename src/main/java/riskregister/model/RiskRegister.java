package riskregister.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Composite data holder that aggregates the project's risk-related POJOs.
 * Contains one instance of each existing domain class in the `riskregister.model` package.
 */
public class RiskRegister implements Serializable {
    private static final long serialVersionUID = 1L;

    private PrimaryRiskInfo primaryRiskInfo;
    private Reason reason;
    private ResidualRisk residualRisk;
    private RiskCategory riskCategory;
    private RiskControlMeasure riskControlMeasure;

    public RiskRegister() {
    }

    public RiskRegister(PrimaryRiskInfo primaryRiskInfo,
                        Reason reason,
                        ResidualRisk residualRisk,
                        RiskCategory riskCategory,
                        RiskControlMeasure riskControlMeasure) {
        this.primaryRiskInfo = primaryRiskInfo;
        this.reason = reason;
        this.residualRisk = residualRisk;
        this.riskCategory = riskCategory;
        this.riskControlMeasure = riskControlMeasure;
    }

    public PrimaryRiskInfo getPrimaryRiskInfo() {
        return primaryRiskInfo;
    }

    public void setPrimaryRiskInfo(PrimaryRiskInfo primaryRiskInfo) {
        this.primaryRiskInfo = primaryRiskInfo;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public ResidualRisk getResidualRisk() {
        return residualRisk;
    }

    public void setResidualRisk(ResidualRisk residualRisk) {
        this.residualRisk = residualRisk;
    }

    public RiskCategory getRiskCategory() {
        return riskCategory;
    }

    public void setRiskCategory(RiskCategory riskCategory) {
        this.riskCategory = riskCategory;
    }

    public RiskControlMeasure getRiskControlMeasure() {
        return riskControlMeasure;
    }

    public void setRiskControlMeasure(RiskControlMeasure riskControlMeasure) {
        this.riskControlMeasure = riskControlMeasure;
    }

    @Override
    public String toString() {
        return "RiskRegister{" +
                "primaryRiskInfo=" + primaryRiskInfo +
                ", reason=" + reason +
                ", residualRisk=" + residualRisk +
                ", riskCategory=" + riskCategory +
                ", riskControlMeasure=" + riskControlMeasure +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiskRegister that = (RiskRegister) o;
        return Objects.equals(primaryRiskInfo, that.primaryRiskInfo) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(residualRisk, that.residualRisk) &&
                Objects.equals(riskCategory, that.riskCategory) &&
                Objects.equals(riskControlMeasure, that.riskControlMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryRiskInfo, reason, residualRisk, riskCategory, riskControlMeasure);
    }
}
