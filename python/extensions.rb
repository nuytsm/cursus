Asciidoctor::Extensions.register do
    docinfo_processor GoogleAnalyticsDocinfoProcessor
  end
  
  Asciidoctor.convert_file 'index.adoc', safe: :safe