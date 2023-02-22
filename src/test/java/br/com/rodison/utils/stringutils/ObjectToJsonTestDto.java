package br.com.rodison.utils.stringutils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class ObjectToJsonTestDto {
    private String stringField;
    private Integer integerField;
    private BigDecimal bigDecimalField;
    private boolean booleanField;
    private Date dateField;
    private LocalDateTime localDateTimeField;

    private ObjectToJsonTestDto(Builder builder) {
        setStringField(builder.stringField);
        setIntegerField(builder.integerField);
        setBigDecimalField(builder.bigDecimalField);
        setBooleanField(builder.booleanField);
        setDateField(builder.dateField);
        setLocalDateTimeField(builder.localDateTimeField);
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public Integer getIntegerField() {
        return integerField;
    }

    public void setIntegerField(Integer integerField) {
        this.integerField = integerField;
    }

    public BigDecimal getBigDecimalField() {
        return bigDecimalField;
    }

    public void setBigDecimalField(BigDecimal bigDecimalField) {
        this.bigDecimalField = bigDecimalField;
    }

    public boolean isBooleanField() {
        return booleanField;
    }

    public void setBooleanField(boolean booleanField) {
        this.booleanField = booleanField;
    }

    public Date getDateField() {
        return dateField;
    }

    public void setDateField(Date dateField) {
        this.dateField = dateField;
    }

    public LocalDateTime getLocalDateTimeField() {
        return localDateTimeField;
    }

    public void setLocalDateTimeField(LocalDateTime localDateTimeField) {
        this.localDateTimeField = localDateTimeField;
    }

    public ObjectToJsonTestDto() {

    }

    public static Builder builder() {
        return Builder.builder();
    }

    public static final class Builder {
        private String stringField;
        private Integer integerField;
        private BigDecimal bigDecimalField;
        private boolean booleanField;
        private Date dateField;
        private LocalDateTime localDateTimeField;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder withStringField(String val) {
            stringField = val;
            return this;
        }

        public Builder withIntegerField(Integer val) {
            integerField = val;
            return this;
        }

        public Builder withBigDecimalField(BigDecimal val) {
            bigDecimalField = val;
            return this;
        }

        public Builder withBooleanField(boolean val) {
            booleanField = val;
            return this;
        }

        public Builder withDateField(Date val) {
            dateField = val;
            return this;
        }

        public Builder withLocalDateTimeField(LocalDateTime val) {
            localDateTimeField = val;
            return this;
        }

        public ObjectToJsonTestDto build() {
            return new ObjectToJsonTestDto(this);
        }
    }
}
