Dear $firstName $lastName,
This is your monthly notification of your Github activity. You currently have ${repositories.size()} repositories on Github and you
had a total of $commits commits this month. We wanted to let you know that these are your latest 3 repositories by activity.

<% repositories.each { repo ->
    println "\t> $repo.name"
} %>

        We thank you for using Github and wish you another month of happy committing.

        Thank You
Github
www.github.com
