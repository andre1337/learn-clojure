(defproject bahasa pemrograman clojure "1.3.0"
  :description "testing untung pembelajaran clojure"
  :aot [examples.tasklist]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.0.6"]
                 [org.clojure/test.generative "0.1.2"]
                 [ring "0.3.11" :exclusions [org.clojure/clojure
                                             org.clojure/clojure-contrib]]
                 [compojure "0.6.5"]
                 [hiccup "0.3.6"]
                 [jline "0.9.94"]
                 [hsqldb "1.8.0.10"]])
