class GoogleAnalyticsDocinfoProcessor < Asciidoctor::Extensions::DocinfoProcessor
    use_dsl
    at_location :footer
    def process document
      #return unless (ga_account_id = document.attr 'google-analytics-account')
      %(<!-- Google tag (gtag.js) -->
      <script async src="https://www.googletagmanager.com/gtag/js?id=G-3K061L13YN"></script>
      <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());
      
        gtag('config', 'G-3K061L13YN');
      </script>
      )
    end
  end
