package adhilrahiman.androidmvvmbase.data.model;

import com.google.gson.annotations.SerializedName;

public class RepoResponse {

    public final long id;
    public final String name;
    public final String description;
    public final UserResponse owner;
    @SerializedName("stargazers_count")
    public final long stars;
    @SerializedName("forks_count")
    public final long forks;

    public RepoResponse(long id, String name, String description, UserResponse owner, long stars, long forks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.stars = stars;
        this.forks = forks;
    }
}
