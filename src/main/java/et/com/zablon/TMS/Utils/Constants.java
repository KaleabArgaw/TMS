package et.com.zablon.TMS.Utils;

public class Constants {
    public static final String[] AUTH_WHITELIST = {
            // -- Swagger UI v2
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**",
            // -- Swagger UI v3 (OpenAPI)
            "/v3/api-docs/**",
            "/swagger-ui/**"
            // other public endpoints of your API may be appended to this array
    };

    //JWT
    public static final String LABEL_ACCESS_TOKEN = "JWT";
    public static final String TOKEN_SIGNATURE = "5817b83286e91337b65c7a35d05fd81f4a4e0314";
    public static final int ACCESS_TOKEN_EXP = 2 * 60 * 60 * 1000;
    public static final int REFRESH_TOKEN_EXP = 5 * 60 * 60 * 1000;

    public static final String HTTP_HEADER = "header";
    public static final String AUTHORIZATION_HEADER = "Authorization";

    public static final String ORGANIZATION = "ORGANIZATION";
    public static final String PERSON = "PERSON";

    //Deductions
    public static final String PERCENT = "percent";
    public static final String FIXED = "fixed";
    public static final String LOP = "lop";
    public static final String INCOME_TAX = "http://localhost:8080/income_tax";
    public static final String LOP_DAYS = "http://localhost:8080/lop_days";



}