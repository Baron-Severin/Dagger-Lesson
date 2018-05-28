package baron.severin.daggerlesson.automatic

import baron.severin.daggerlesson.Api
import baron.severin.daggerlesson.Cache
import baron.severin.daggerlesson.Repo
import dagger.Module
import dagger.Provides

@Module class AutoModule {

    @Provides fun providesRepo(api: Api, cache: Cache) : Repo {
        return Repo(api, cache)
    }

    @Provides fun providesApi() : Api {
        return Api()
    }

    @Provides fun providesCache() : Cache {
        return Cache()
    }
}