package org.motechproject.pillreminder.builder.testbuilder;

import org.joda.time.LocalDate;
import org.motechproject.commons.date.model.Time;
import org.motechproject.pillreminder.domain.Dosage;

public class DosageBuilder {
    private Dosage dosage = new Dosage();

    public DosageBuilder withResponseLastCapturedDate(LocalDate responseLastCapturedDate) {
        dosage.setResponseLastCapturedDate(responseLastCapturedDate);
        return this;
    }

    public DosageBuilder withId(Long id) {
        dosage.setId(id);
        return this;
    }

    public DosageBuilder withDosageTime(Time dosageTime) {
        dosage.setDosageTime(dosageTime);
        return this;
    }

    public Dosage build() {
        return dosage;
    }
    public static DosageBuilder newDosage() {
        return new DosageBuilder();
    }

}
