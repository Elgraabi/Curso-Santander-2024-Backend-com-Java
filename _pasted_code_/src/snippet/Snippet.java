package snippet;

public class Snippet {
	public static void main(String[] args) {
		spring:
		  datasource:
		    url: jdbc:postgresql://${PGHOST}:${PGPORT}/${PGDATABASE}
		    username: ${PGUSER}
		    password: ${PGPASSWORD}
		  jpa:
		    open-in-view: false
		    hibernate:
		      ddl-auto: validate
	}
}

