import SwiftUI
import ComposeApp

@main
struct iOSApp: App {
    // KMM - Koin Call
    init() {
        KoinHelperKt.doInitKoin(repository: DarwinRepository())
    }

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}