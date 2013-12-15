import redpill.User

class BootStrap {

    def init = { servletContext ->

        Locale.setDefault(new Locale("ru"));

        def user = new User(userName: 'NAME', password: '123')
        user.save(flush: true, failOnError:true)

    }
    def destroy = {
    }
}
