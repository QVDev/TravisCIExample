if [ "$TRAVIS_PULL_REQUEST" == "false" ]; then
  echo -e "Starting to update gh-pages\n"

  cp -R coverage $HOME/TravisForAndroid/build

  cd $HOME
  git config --global user.email "feedbackandroid@gmail.com	"
  git config --global user.name "QVDev"
  git clone --quiet --branch=gh-pages https://${GH_TOKEN}@github.com/QVDev/TravisCIExample.git  gh-pages > /dev/null

  cd gh-pages
  cp -Rf $HOME/coverage/* .

  git add -f .
  git commit -m "Travis build $TRAVIS_BUILD_NUMBER pushed to gh-pages"
  git push -fq origin gh-pages > /dev/null

  echo -e "Done magic with coverage\n"
fi