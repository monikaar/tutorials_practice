job('Maven project via DSL') {
	description('Maven job created via Jenkins DSL')
	}
	scm {
		github("https://github.com/monikaar/tutorials_practice.git", 'main')
	}

	trigger {
		scm('* * * * *')
	}
	steps {
		maven('clean package', 'maven-samples/single-module/pom.xml')
	}

	publishers {
		//archive the atifacts
		archiveArtifacts('**/*.jar')
	}