package baron.severin.daggerlesson.manual

import baron.severin.daggerlesson.Repo

class ManualComponent {
    private val module = ManualModule()
    private val repo : Repo

    init {
        val api = module.providesApi()
        val cache = module.providesCache()
        repo = module.providesRepo(api, cache)
    }

    fun inject(activity: ManualActivity) {
        activity.repo = repo
    }
}