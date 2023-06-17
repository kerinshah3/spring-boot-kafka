plugins {
	java
	id("org.springframework.boot") version "3.1.0"
	id("io.spring.dependency-management") version "1.1.0"

}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.kafka:spring-kafka")
	implementation("org.projectlombok:lombok:1.18.26")
	implementation("org.mongodb:mongodb-driver-sync:4.9.0")
	implementation("org.springframework:spring-webflux:6.0.6")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb:3.0.7")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive:3.0.4")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
