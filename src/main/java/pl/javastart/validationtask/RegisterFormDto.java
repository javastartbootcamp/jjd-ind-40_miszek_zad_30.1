package pl.javastart.validationtask;

import javax.validation.constraints.*;

public class RegisterFormDto {

    @NotBlank(message = "Pole nie może być puste")
    @Size(min = 3, message = "Pole musi mieć conajmniej 3 znaki")
    private String firstName;

    @NotBlank(message = "Pole nie może być puste")
    @Size(min = 3, message = "Pole musi mieć conajmniej 3 znaki")
    private String surname;

    @NotBlank(message = "Pole nie może być puste")
    private String address;

    @NotBlank(message = "Pole nie może być puste")
    @Pattern(regexp = "\\d{2}-\\d{3}", message = "Wpisz poprawny kod pocztowy")
    private String postalCode;

    @NotBlank(message = "Pole nie może być puste")
    private String city;

    @NotBlank(message = "Pole nie może być puste")
    @Email(message = "musi być poprawnie sformatowanym adresem e-mail")
    private String email;

    @NotBlank(message = "Pole nie może być puste")
    @Size(min = 8, message = "Hasłol musi mieć conajmniej 8 znaków")
    private String password;

    @AssertTrue(message = "Akceptacja regulaminu jest wymagana")
    private boolean termsAgreement;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTermsAgreement() {
        return termsAgreement;
    }

    public void setTermsAgreement(boolean termsAgreement) {
        this.termsAgreement = termsAgreement;
    }
}
