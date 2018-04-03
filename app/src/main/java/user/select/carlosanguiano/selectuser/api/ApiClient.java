package user.select.carlosanguiano.selectuser.api;import okhttp3.OkHttpClient;import okhttp3.logging.HttpLoggingInterceptor;import retrofit2.Retrofit;import retrofit2.converter.gson.GsonConverterFactory;/** * Created by Carlos Anguiano on 4/2/18. * For more info contact: c.joseanguiano@gmail.com */public class ApiClient {    private static Retrofit retrofit = null;    public static Retrofit getClient() {        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();        retrofit = new Retrofit.Builder()                .baseUrl("https://jsonplaceholder.typicode.com")                .addConverterFactory(GsonConverterFactory.create())                .client(client)                .build();        return retrofit;    }}