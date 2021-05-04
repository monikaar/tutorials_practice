job('Maven project via DSL')
	description("Mave job created via Jenkins DSL on ${new Date()}")
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