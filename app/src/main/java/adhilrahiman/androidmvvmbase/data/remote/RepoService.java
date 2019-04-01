package adhilrahiman.androidmvvmbase.data.remote;

import java.util.List;

import adhilrahiman.androidmvvmbase.data.model.RepoResponse;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RepoService {

    @GET("orgs/Google/repos")
    Single<List<RepoResponse>> getRepositories();

    @GET("repos/{owner}/{name}")
    Single<RepoResponse> getRepo(@Path("owner") String owner, @Path("name") String name);
}
