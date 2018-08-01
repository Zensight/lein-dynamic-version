(defproject co.zensight/lein-dynamic-version "0.1.2-SNAPSHOT"
  :description "Populate your leiningen project version from external sources"
  :url "https://github.com/Zensight/lein-dynamic-version"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :deploy-repositories [["releases" :clojars]]
  :profiles {:clojure-1.8.0 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :clojure-dev {:dependencies [[org.clojure/clojure "1.9.0-alpha14"]]}
             :test {:resource-paths ["test/resources"]}})
