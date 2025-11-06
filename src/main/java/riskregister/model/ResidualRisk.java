package riskregister.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Data container for residual risk information.
 *
 * Fields map to the provided form input types (all Text -> String):
 * - Financial Risk
 * - Likelihood Scale
 * - Reputational Risk Impact
 */
public class ResidualRisk implements Serializable {
    private static final long serialVersionUID = 1L;

    private String financialRisk = "";
    private String likelihoodScale = "";
    private String reputationalRiskImpact = "";

    public ResidualRisk() {
    }

    public ResidualRisk(String financialRisk, String likelihoodScale, String reputationalRiskImpact) {
        this.financialRisk = financialRisk;
        this.likelihoodScale = likelihoodScale;
        this.reputationalRiskImpact = reputationalRiskImpact;
    }

    public String getFinancialRisk() {
        return financialRisk;
    }

    public void setFinancialRisk(String financialRisk) {
        this.financialRisk = financialRisk;
    }

    public String getLikelihoodScale() {
        return likelihoodScale;
    }

    public void setLikelihoodScale(String likelihoodScale) {
        this.likelihoodScale = likelihoodScale;
    }

    public String getReputationalRiskImpact() {
        return reputationalRiskImpact;
    }

    public void setReputationalRiskImpact(String reputationalRiskImpact) {
        this.reputationalRiskImpact = reputationalRiskImpact;
    }

    @Override
    public String toString() {
        return "ResidualRisk{" +
                "financialRisk='" + financialRisk + '\'' +
                ", likelihoodScale='" + likelihoodScale + '\'' +
                ", reputationalRiskImpact='" + reputationalRiskImpact + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidualRisk that = (ResidualRisk) o;
        return Objects.equals(financialRisk, that.financialRisk) &&
                Objects.equals(likelihoodScale, that.likelihoodScale) &&
                Objects.equals(reputationalRiskImpact, that.reputationalRiskImpact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(financialRisk, likelihoodScale, reputationalRiskImpact);
    }
}
