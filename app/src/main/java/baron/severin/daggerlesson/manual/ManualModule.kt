package baron.severin.daggerlesson.manual

import baron.severin.daggerlesson.Api
import baron.severin.daggerlesson.Cache
import baron.severin.daggerlesson.Repo

class ManualModule {

    fun providesRepo(api : Api, cache : Cache) : Repo {
        return Repo(api, cache)
    }

    fun providesApi() : Api {
        return Api()
    }

    fun providesCache() : Cache {
        return Cache()
    }
}