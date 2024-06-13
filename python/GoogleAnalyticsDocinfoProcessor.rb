require 'asciidoctor/extensions'

class GoogleAnalyticsDocinfoProcessor < Asciidoctor::Extensions::DocinfoProcessor
  use_dsl
  at_location :footer

  def process(document)
    google_analytics_account_id = document.attr('google_analytics_account_id')
    puts "Google Analytics Account ID: #{google_analytics_account_id}"
    return unless google_analytics_account_id

    %(<script async src="https://www.googletagmanager.com/gtag/js?id=#{google_analytics_account_id}"></script>
      <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());
        gtag('config', '#{google_analytics_account_id}');
      </script>)
  end
end

Asciidoctor::Extensions.register do
  docinfo_processor GoogleAnalyticsDocinfoProcessor
end
