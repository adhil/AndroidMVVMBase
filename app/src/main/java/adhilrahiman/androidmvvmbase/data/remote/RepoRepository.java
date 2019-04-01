package adhilrahiman.androidmvvmbase.data.remote;

import java.util.List;

import javax.inject.Inject;

import adhilrahiman.androidmvvmbase.data.model.RepoResponse;
import io.reactivex.Single;

public class RepoRepository {

    private final RepoService repoService;

    @Inject
    public RepoRepository(RepoService repoService) {
        this.repoService = repoService;
    }

    public Single<List<RepoResponse>> getRepositories() {
        return repoService.getRepositories();
    }

    public Single<RepoResponse> getRepo(String owner, String name) {
        return repoService.getRepo(owner, name);
    }
}
