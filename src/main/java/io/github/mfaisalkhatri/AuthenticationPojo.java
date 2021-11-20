package io.github.mfaisalkhatri;

/**
 * Created By Faisal Khatri on 19-11-2021
 */
public class AuthenticationPojo {

    private String email;
    private String password;

    /**
     * Created By Faisal Khatri on 19-11-2021
     *
     * @param email
     * @param password
     */
    public AuthenticationPojo (String email, String password) {
        this.email = email;
        this.password = password;
    }

}