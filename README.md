# spring-cloud-demo


https://github.com/svlugovoy/configs

**9000** - config-server

**8761** - eureka-server

**8101** - room-services

[http://localhost:9000/guestservices/default](http://localhost:9000/guestservices/default)

**8102** - guest-services

[http://localhost:9000/guestservices/default](http://localhost:9000/guestservices/default)

**8103** - reservation-services

[http://localhost:9000/reservationservices/default](http://localhost:9000/reservationservices/default)

**8500** - reservation-business-services

[http://localhost:9000/reservationbusinessservices/default](http://localhost:9000/reservationbusinessservices/default)

[http://localhost:8500/hystrix](http://localhost:8500/hystrix)

localhost:8500/actuator/hystrix.stream -> Monitor Stream

https://stackoverflow.com/questions/49792290/unable-to-connect-to-command-metric-stream-for-hystrix-dashboard-with-spring-clo

**8600** - reservation-app

[http://localhost:8600/reservations?date=2017-01-01](http://localhost:8600/reservations?date=2017-01-01)

[http://localhost:9000/reservationapp/default](http://localhost:9000/reservationapp/default)