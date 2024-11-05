package seedu.academyassist.model.person;

/**
 * Enum representing the subjects available in the system.
 * Each subject has a name that can be accessed via the {@link #getSubjectName()} method.
 */
public enum SubjectEnum {
    ENGLISH("English"),
    CHINESE("Chinese"),
    MALAY("Malay"),
    TAMIL("Tamil"),
    MATH("Math"),
    FURTHER_MATH("Further Math"),
    SCIENCE("Science"),
    HISTORY("History"),
    GEOGRAPHY("Geography"),
    LITERATURE("Literature"),
    ECONOMICS("Economics"),
    ACCOUNTING("Accounting"),
    BUSINESS("Business"),
    PHYSICS("Physics"),
    CHEMISTRY("Chemistry"),
    BIOLOGY("Biology"),
    COMPUTING("Computing");


    /** The name of the subject. */
    private final String subjectName;

    /**
     * Constructs a SubjectEnum with the specified subject name.
     *
     * @param subjectName The name of the subject.
     */
    SubjectEnum(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * Returns the name of the subject.
     *
     * @return The subject name as a string.
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Checks if the given subject is valid.
     * A valid subject matches any of the available subjects, case-insensitive.
     *
     * @param subject The subject to check.
     * @return {@code true} if the subject is valid, {@code false} otherwise.
     */
    public static boolean isValidSubject(String subject) {
        for (SubjectEnum s : values()) {
            if (s.getSubjectName().equalsIgnoreCase(subject)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the corresponding SubjectEnum constant from a given string.
     * This method performs a case-insensitive comparison.
     *
     * @param subject The subject string to convert.
     * @return The matching {@link SubjectEnum} constant.
     * @throws IllegalArgumentException If the subject is not found.
     */
    public static SubjectEnum fromString(String subject) {
        for (SubjectEnum s : values()) {
            if (s.getSubjectName().equalsIgnoreCase(subject)) {
                return s;
            }
        }
        throw new IllegalArgumentException("No such subject: " + subject);
    }
}
