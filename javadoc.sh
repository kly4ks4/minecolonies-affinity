
curl -H "Content-Type: application/json" -H "authToken: $GITHUB_TOKEN" \
      --request POST \
      --data '{"state":"pending",
      "target_url":"https://travis-ci.org/Minecolonies/minecolonies/builds/$TRAVIS_BUILD_ID",
      "description":"Javadoc build status",
      "context":"javadoc"}' \
      "https://api.github.com/repos/Minecolonies/minecolonies/statuses/$TRAVIS_COMMIT"
      

./gradlew javadoc


