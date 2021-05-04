job('Maven project via DSL') {
	description('Maven job created via Jenkins DSL')
	}
	scm {
		git("https://github.com/monikaar/tutorials_practice.git",main)
	}

	trigger {
		scm('* * * * *')
	}
	steps {
		maven('clean, package', 'maven-samples/single-module/pom.xml')
	}

	publisher {
		//archive the atifacts
		archiveArtifacts '**/*.jar'
	}