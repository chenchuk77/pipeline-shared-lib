package net.kukinet;
import static groovy.io.FileType.FILES

@NonCPS
def get_artifacts(from_folder) {
    //from_folder = '/home/chenchuk/dev/unlk/lms'
    def artifacts = []
    new File(from_folder).eachFileRecurse(FILES) {
        if(it.name.endsWith('.war') ||
                it.name.endsWith('.tar') ||
                it.name.endsWith('.tar.gz') ) {
            artifacts.add(it)
        }
    }
    return artifacts
}

def do_something(){
  sh "echo 'doing something ...'"
}
