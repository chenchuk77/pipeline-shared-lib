package net.kukinet;
import static groovy.io.FileType.FILES

def get_artifacts(from_folder) {
    println(from_folder)
    //from_folder = '/home/chenchuk/dev/unlk/lms'
    def artifacts = []
    new File(from_folder).eachFileRecurse(FILES) {
        if(it.name.endsWith('.war') ||
                it.name.endsWith('.tar') ||
                it.name.endsWith('.tar.gz') ) {
            artifacts.add(it)
        }
    }
//    return artifacts
    return from_folder
}

@NonCPS
def print_artifacts(artifacts){
    artifacts.each{
        println "artifact: ${it}"
    }
}

def do_something(){
  sh "echo 'doing something ...'"
}
