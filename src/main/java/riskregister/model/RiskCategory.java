package riskregister.model;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Data container for risk category information.
 *
 * Fields map to the provided form input types:
 * - Cause: Text -> String
 * - Cause Sub-Classification: Text -> String
 * - Type: Text list -> List<String>
 * - Consequence: inlined fields
 */
public class RiskCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    // Cause - Text
    private String cause = "";

    // Cause Sub-Classification - Text
    private String causeSubClassification = "";

    // Type - Text list
    private List<String> type = new ArrayList<>();

    // Consequence fields
    private String financialRiskImpact = "";
    private String businessDisruptionRisk = "";
    private String reputationRiskImpact = "";
    private String likelihoodScale = "";

    public RiskCategory() {
    }

    public RiskCategory(String cause,
                        String causeSubClassification,
                        List<String> type,
                        String financialRiskImpact,
                        String businessDisruptionRisk,
                        String reputationRiskImpact,
                        String likelihoodScale) {
        this.cause = cause;
        this.causeSubClassification = causeSubClassification;
        this.type = type == null ? new ArrayList<>() : type;
        this.financialRiskImpact = financialRiskImpact;
        this.businessDisruptionRisk = businessDisruptionRisk;
        this.reputationRiskImpact = reputationRiskImpact;
        this.likelihoodScale = likelihoodScale;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getCauseSubClassification() {
        return causeSubClassification;
    }

    public void setCauseSubClassification(String causeSubClassification) {
        this.causeSubClassification = causeSubClassification;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type == null ? new ArrayList<>() : type;
    }

    public String getFinancialRiskImpact() {
        return financialRiskImpact;
    }

    public void setFinancialRiskImpact(String financialRiskImpact) {
        this.financialRiskImpact = financialRiskImpact;
    }

    public String getBusinessDisruptionRisk() {
        return businessDisruptionRisk;
    }

    public void setBusinessDisruptionRisk(String businessDisruptionRisk) {
        this.businessDisruptionRisk = businessDisruptionRisk;
    }

    public String getReputationRiskImpact() {
        return reputationRiskImpact;
    }

    public void setReputationRiskImpact(String reputationRiskImpact) {
        this.reputationRiskImpact = reputationRiskImpact;
    }

    public String getLikelihoodScale() {
        return likelihoodScale;
    }

    public void setLikelihoodScale(String likelihoodScale) {
        this.likelihoodScale = likelihoodScale;
    }

    @Override
    public String toString() {
        return "RiskCategory{" +
                "cause='" + cause + '\'' +
                ", causeSubClassification='" + causeSubClassification + '\'' +
                ", type=" + type +
                ", financialRiskImpact='" + financialRiskImpact + '\'' +
                ", businessDisruptionRisk='" + businessDisruptionRisk + '\'' +
                ", reputationRiskImpact='" + reputationRiskImpact + '\'' +
                ", likelihoodScale='" + likelihoodScale + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiskCategory that = (RiskCategory) o;
        return Objects.equals(cause, that.cause) &&
                Objects.equals(causeSubClassification, that.causeSubClassification) &&
                Objects.equals(type, that.type) &&
                Objects.equals(financialRiskImpact, that.financialRiskImpact) &&
                Objects.equals(businessDisruptionRisk, that.businessDisruptionRisk) &&
                Objects.equals(reputationRiskImpact, that.reputationRiskImpact) &&
                Objects.equals(likelihoodScale, that.likelihoodScale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cause, causeSubClassification, type, financialRiskImpact, businessDisruptionRisk, reputationRiskImpact, likelihoodScale);
    }
}
