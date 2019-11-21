//def call(body) {
def call(Map config) {
	/*def config = [:]
	body.resolveStrategy = Closure.DELEGATE_FIRST
	body.delegate = config
	body()*/
	pipeline{
	agent {label config.slave}
	stages{
		stage('checkout'){
			steps{
				dir('source'){
					//git url:"${config.Git_url}",credentialsId:"${.config.Git_Credentials}",branch:"${config.Branch_Name}"
					println "from sharedexample1
				}
			}//steps
		}//stage	
	}//stages
	}//pipeline
}
