package cat.michal.pcs

import cat.michal.pcs.services.DiscordService
import java.awt.Desktop
import java.net.URI

class PolishCoderSecurity {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val uri = URI(DiscordService.getToken())
            Desktop.getDesktop().browse(uri);
        }
    }
}