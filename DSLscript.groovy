job('Maven project via DSL') {
	description('Maven job created via Jenkins DSL')
	
	scm {
		github("monikaar/tutorials_practice", 'main')
	}

	triggers {
		scm('* * * * *')
	}
	steps {
		maven('clean package', 'maven-samples/single-module/pom.xml')
	}

	publishers {
		//archive the atifacts
		archiveArtifacts('**/*.jar')
	}
	
}