/// Initial Deployment
// job('New Hello-World Job') {
//     description('New-Hello-World-Job')
//     steps {
//         shell('echo Hello World!')
//     }
// }

job('Node-Basic-App') {
    description('Node-Basic-Hello-World-Application')
    scm {
       git('https://github.com/rradu19/node-basic-app.git')
    }

    wrappers{
        nodejs('nodejs')
    }

    steps {
        shell('npm install')
    }

}
