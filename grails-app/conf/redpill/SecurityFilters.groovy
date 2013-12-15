package redpill

class SecurityFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                if (!session.user
                        && (!controllerName.equals('user') & !actionName.equals('login'))) {
                    log.error("No user log")
                    flash.message = 'You are not loggined'
                    redirect(controller: "user", action: 'login')
//                    return false
                }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
