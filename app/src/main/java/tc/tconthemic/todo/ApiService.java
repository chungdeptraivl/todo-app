package tc.tconthemic.todo;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface ApiService {
    @GET("/todos")
    Call<List<Todo>> getTodos();
}

