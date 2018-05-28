package baron.severin.daggerlesson.manual

class ManualComponent {
    private val module = ManualModule()

    fun inject(activity: ManualActivity) {
        val api = module.providesApi()
        val cache = module.providesCache()
        activity.repo = module.providesRepo(api, cache)
    }
}