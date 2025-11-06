package riskregister.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Data container for control reasons.
 *
 * Fields map to the provided form input types (all Text -> String):
 * - Reasons
 * - Comments
 */
public class Reason implements Serializable {
    private static final long serialVersionUID = 1L;

    private String reasons = "";
    private String comments = "";

    public Reason() {
    }

    public Reason(String reasons, String comments) {
        this.reasons = reasons;
        this.comments = comments;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "RiskControlReason{" +
                "reasons='" + reasons + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reason that = (Reason) o;
        return Objects.equals(reasons, that.reasons) &&
                Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reasons, comments);
    }
}
