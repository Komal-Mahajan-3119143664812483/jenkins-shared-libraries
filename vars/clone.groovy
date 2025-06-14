def call(String url, String branch){
  echo "This will clone the code"
  git url: url, branch: branch
  echo "Code cloned successfully"
}
