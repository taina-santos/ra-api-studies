package core;

public class KeysURL {

    public final static String BASE_URL = "https://serverest.dev";
    public static final String LOGIN_URL = "/login";

    //Definindo setup inicial com a construção do request e response,
    // todas as classes de teste herdarão esse setup inicial
//    public void initialSetup(){
//        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
//        reqBuilder.setBaseUri(BASE_URL);
//        reqBuilder.setContentType(ContentType.JSON);
//        RestAssured.requestSpecification = reqBuilder.build();
//
//        ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
//        resBuilder.expectResponseTime(Matchers.lessThan(10000L));
//        RestAssured.responseSpecification = resBuilder.build();
//    }

}
